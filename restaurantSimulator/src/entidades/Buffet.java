
package entidades;

import java.util.Random;

/**
 *
 * @author Daniel Dalpasquale
 * @RA 2003244
 *
 */

public class Buffet {
    private int
            nrPessoas , nrPratos,nrSalada,nrCarboidratos,nrProteinas,
            suco,tpMinAlimentacao,tpMaxAlimentacao,resultados[],bTempoMedio,
            bTempoTotal,bTempoMinimo,bTempoMaximo;

    private Pessoa listPessoas[];
    private itensBuffet itens[];

    public void Start(){

        this.listPessoas = new Pessoa[this.getNrPessoas()];
        this.resultados = new int[this.getNrPessoas()];
        this.itens = new itensBuffet[5];

        itens[0] = new itensBuffet();
        itens[0].setQtsSuportado(nrPratos);
        itens[0].setQtdAtual(nrPratos);
        itens[1] = new itensBuffet();
        itens[1].setQtsSuportado(nrSalada);
        itens[1].setQtdAtual(nrSalada);
        itens[2] = new itensBuffet();
        itens[2].setQtsSuportado(nrCarboidratos);
        itens[2].setQtdAtual(nrCarboidratos);
        itens[3] = new itensBuffet();
        itens[3].setQtsSuportado(nrProteinas);
        itens[3].setQtdAtual(nrProteinas);
        itens[4] = new itensBuffet();
        itens[4].setQtsSuportado(suco);
        itens[4].setQtdAtual(suco);

        this.fila();
        this.numerosAleatorios();
        this.processarResultados();
        this.bTempoMedio = tempoMedio();
        this.bTempoTotal = tempoTotal();

    }

    public void processarResultados(){
        for(int i = 0; i < this.listPessoas.length; i++){
            this.resultados[i] = this.listPessoas[i].getTempoAlimentaca() + this.listPessoas[i].getTempoBuffet();
        }
    }

    public int tempoTotal(){
        int total = 0;
        for(int i = 0 ; i < this.resultados.length; i++){
            if(this.resultados[i] >=total){
                total = this.resultados[i];
            }
        }
        return total;
    }

    public int tempoMedio(){
        int tempoM = 0;
        for(int i = 0; i < this.resultados.length; i++){
            tempoM += this.resultados[i];
        }
        return tempoM/this.nrPessoas;
    }

    public void numerosAleatorios(){
       for (Pessoa listPessoa : this.listPessoas) {
           listPessoa.setTempoAlimentaca(this.aleatoriar(this.tpMinAlimentacao, this.tpMaxAlimentacao));
       }
    }

    public void fila(){
        this.popularPessoas();
        for(int i = 0; i < this.listPessoas.length;i ++){
            this.servir(0,i);
        }
    }

    public void servir(int item,int pessoa){
        if(item < 5){

            if(this.itens[item].getQtdAtual() > 0){
                this.listPessoas[pessoa].addTempoBuffet();
                this.itens[item].servir();
                this.servir(item + 1, pessoa);
            }else if(this.itens[item].getQtdAtual() == 0){
                 this.itens[item].repor();
                 this.ajustTempoAtraso(pessoa,item);
                 this.servir(item, pessoa);
            }
        }
    }

    public void  ajustTempoAtraso(int pessoaAtual, int itemAtual){
       int cont = (pessoaAtual + itemAtual)-1;
        for(int i = pessoaAtual; i <= cont; i++){
            if(i < this.nrPessoas){
                this.listPessoas[i].addTempoBuffet();
            }
        }
    }

    public void popularPessoas(){
        for(int i = 0;i < this.listPessoas.length; i++){
            this.listPessoas[i] = new Pessoa();
            this.listPessoas[i].setTempoBuffet(2);
        }
    }

    public int aleatoriar(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }

    /**
     *
     * Gets And Sets
     *
     */


    public int getNrPessoas() {
        return nrPessoas;
    }

    public void setNrPessoas(int nrPessoas) {
        this.nrPessoas = nrPessoas;
    }

    public int getNrPratos() {
        return nrPratos;
    }

    public void setNrPratos(int nrPratos) {
        this.nrPratos = nrPratos;
    }

    public int getNrSalada() {
        return nrSalada;
    }

    public void setNrSalada(int nrSalada) {
        this.nrSalada = nrSalada;
    }

    public int getNrCarboidratos() {
        return nrCarboidratos;
    }

    public void setNrCarboidratos(int nrCarboidratos) {
        this.nrCarboidratos = nrCarboidratos;
    }

    public int getNrProteinas() {
        return nrProteinas;
    }

    public void setNrProteinas(int nrProteinas) {
        this.nrProteinas = nrProteinas;
    }

    public int getSuco() {
        return suco;
    }

    public void setSuco(int suco) {
        this.suco = suco;
    }

    public int getTpMinAlimentacao() {
        return tpMinAlimentacao;
    }

    public void setTpMinAlimentacao(int tpMinAlimentacao) {
        this.tpMinAlimentacao = tpMinAlimentacao;
    }

    public int getTpMaxAlimentacao() {
        return tpMaxAlimentacao;
    }

    public void setTpMaxAlimentacao(int tpMaxAlimentacao) {
        this.tpMaxAlimentacao = tpMaxAlimentacao;
    }

    public int getbTempoMedio() {
        return bTempoMedio;
    }

    public void setbTempoMedio(int bTempoMedio) {
        this.bTempoMedio = bTempoMedio;
    }

    public int getbTempoTotal() {
        return bTempoTotal;
    }

    public void setbTempoTotal(int bTempoTotal) {
        this.bTempoTotal = bTempoTotal;
    }

    public int getbTempoMinimo() {
        return bTempoMinimo;
    }

    public void setbTempoMinimo(int bTempoMinimo) {
        this.bTempoMinimo = bTempoMinimo;
    }

    public int getbTempoMaximo() {
        return bTempoMaximo;
    }

    public void setbTempoMaximo(int bTempoMaximo) {
        this.bTempoMaximo = bTempoMaximo;
    }
}
