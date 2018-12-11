package entidades;

/**
 *
 * @author Daniel Dalpasquale
 * @RA 2003244
 *
 */

public class itensBuffet {
    private int qtdAtual;
    private int qtsSuportado;


    public void repor(){
        this.setQtdAtual(this.getQtsSuportado());
    }
    public void servir(){
        this.setQtdAtual(this.getQtdAtual() - 1);
    }

    /**
     *
     * Gets And Sets
     *
     */

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtsSuportado() {
        return qtsSuportado;
    }

    public void setQtsSuportado(int qtsSuportado) {
        this.qtsSuportado = qtsSuportado;
    }
}
