/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Assus
 */
public class Conexão {
    
    private Connection connection = null;

    public Conexão() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String databaseURL = "jdbc:postgresql://localhost/simuladorderestaurante";
        String usuario = "postgres";
        String senha = "9812DanDan9812";
        String driverName = "org.postgresql.Driver";
        //Carrega o driver        
        Class.forName(driverName).newInstance();
        //Conecta o BD
        connection = DriverManager.getConnection(databaseURL, usuario, senha);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
