
package DAO;

import Conexão.Conexão;
import Entidades.Simulação;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Dalpasquale
 * @RA 2003244
 *
 */

public class DAOSimulações {
    
    private Conexão conexão;
    private String sql;

    public DAOSimulações() throws ClassNotFoundException, IllegalAccessException, InstantiationException,
            SQLException {
        conexão = new Conexão();
    }

    //Esse metodo vai cadastrar um endereco e vai retornar o cod_endereco
    public int inserirEndereco(Simulação endereco) throws SQLException {
        //Insere endereco no banco de dados
        String sql = "INSERT INTO Simulação (cod_Simulação, pessoas, pratos , salada , carboidratos , proteinas , suco , tempototal , tempomedio) VALUES ('"
                + Simulação.getId() + "',"
                + Simulação.getPessoas() + "',"
                + Simulação.getPratos()+ ",'"
                + Simulação.getSalada() + "',"
                + Simulação.getCarboidratos() + "',"
                + Simulação.getProteinas() + "',"
                + Simulação.getSuco() + "',"
                + Simulação.getTempoTotal() + "',"
                + Simulação.getTempoMedio() + "',";

        Statement stm = conexão.getConnection().createStatement();
        stm.execute(sql);

        //Consulta e retorna o codigo do endereco inserido
        sql = "SELECT * FROM endereco WHERE cod_simulação = '"
                + Simulação.getId() + "' AND = pessoas = "
                + Simulação.getPessoas() + "' AND pratos = "
                + Simulação.getPratos()+ "' AND salada = "
                + Simulação.getSalada() + "' AND carboidratos = "
                + Simulação.getCarboidratos() + "' AND proteinas = "
                + Simulação.getProteinas() + "' AND suco = "
                + Simulação.getSuco() + "' AND tempototal = "
                + Simulação.getTempoTotal() + "' AND tempomedio = "
                + Simulação.getTempoMedio() + "';";
        
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        return rs.getInt("cod_endereco");
    }

    public Simulação consultaSimulação(int id) throws SQLException {
        Simulação endereco = new Simulação();
        
        String sql = "SELECT * FROM endereco WHERE cod_simulação = " + id + ";";
        Statement stm = conexão.getConnection().createStatement();
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        Simulação.setId             (rs.getInt("cod_simulção"));
        Simulação.setPessoas        (rs.getInt("pessoas"));
        Simulação.setPratos         (rs.getInt("pratos"));
        Simulação.setSalada         (rs.getInt("salada"));
        Simulação.setCarboidratos   (rs.getInt("carboidratos"));
        Simulação.setProteinas      (rs.getInt("proteinas"));
        Simulação.setSuco           (rs.getInt("suco"));
        Simulação.setTempoTotal     (rs.getInt("tempototal"));
        Simulação.setTempoMedio     (rs.getInt("tempomedio"));
        return endereco;
    }
    
}
