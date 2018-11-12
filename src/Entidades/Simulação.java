package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Dalpasquale
 * @RA 2003244
 *
 */
public class Simulação {

    private static int id, pessoas, pratos, salada, carboidratos,
            proteinas, suco, tempoTotal;
    private static double tempoMedio;

    public Simulação() {

    }

    public Simulação(int id, int pessoas, int pratos, int salada,
            int carboidratos, int proteinas, int suco,
            int tempoTotal, double tempoMedio) {

        Simulação.id = id;
        Simulação.pessoas = pessoas;
        Simulação.pratos = pratos;
        Simulação.salada = salada;
        Simulação.carboidratos = carboidratos;
        Simulação.proteinas = proteinas;
        Simulação.suco = suco;
        Simulação.tempoTotal = tempoTotal;
        Simulação.tempoMedio = tempoMedio;

    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        Simulação.pessoas = pessoas;
    }

    public int getPratos() {
        return pratos;
    }

    public void setPratos(int pratos) {
        Simulação.pratos = pratos;
    }

    public int getSalada() {
        return salada;
    }

    public void setSalada(int salada) {
        Simulação.salada = salada;
    }

    public int getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(int carboidratos) {
        Simulação.carboidratos = carboidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        Simulação.proteinas = proteinas;
    }

    public int getSuco() {
        return suco;
    }

    public void setSuco(int suco) {
        Simulação.suco = suco;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        Simulação.tempoTotal = tempoTotal;
    }

    public double getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(double tempoMedio) {
        Simulação.tempoMedio = tempoMedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Simulação.id = id;
    }

}
