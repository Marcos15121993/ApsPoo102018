
package entidades;

/**
 *
 * @author Daniel Dalpasquale
 * @RA 2003244
 *
 */

public class Pessoa {
    private int tempoBuffet;
    private int tempoAlimentaca;


    public void addTempoBuffet(){
        this.setTempoBuffet(this.getTempoBuffet() + 1);
    }

    /**
     *
     * Gets And Sets
     *
     */

    public int getTempoBuffet() {
        return tempoBuffet;
    }

    public void setTempoBuffet(int tempoBuffet) {
        this.tempoBuffet = tempoBuffet;
    }

    public int getTempoAlimentaca() {
        return tempoAlimentaca;
    }

    public void setTempoAlimentaca(int tempoAlimentaca) {
        this.tempoAlimentaca = tempoAlimentaca;
    }
}
