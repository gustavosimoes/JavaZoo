package javazoo;

public class Coruja extends Animal {

    private int alturaVoo;

    public int getAlturaVoo() {
        return alturaVoo;
    }

    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }

    @Override
    public void fazBarulho() {
        System.out.println("Uuu-u-uhuhuhu!");
    }

    @Override
    public String mostraInfo() {
        return "Coruja{"
                + "\nNome: " + nome
                + "\nNumero de Patas: " + nPatas
                + "\nCor: " + cor
                + "\nalturaVoo: " + alturaVoo
                + "\n}\n";
    }

}
