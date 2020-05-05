package javazoo;

public class Leao extends Animal {

    private float tamanhoJuba;

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }

    @Override
    public void fazBarulho() {
        System.out.println("Roar");
    }

    @Override
    public String mostraInfo() {
        return "Leao{"
                + "\nNome: " + nome
                + "\nNumero de Patas: " + nPatas
                + "\nCor: " + cor
                + "\nTamanho da Juba: " + tamanhoJuba
                + "\n}\n";
    }
}
