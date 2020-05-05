package javazoo;

public class Peixe extends Animal{
    
    private int nBarbatanas;

    public int getnBarbatanas() {
        return nBarbatanas;
    }

    public void setnBarbatanas(int nBarbatanas) {
        this.nBarbatanas = nBarbatanas;
    }
    
    @Override
    public void fazBarulho(){
        System.out.println("Burururu!");
    }
    
    @Override
    public String mostraInfo() {
        return "Peixe{"
                + "\nNome: " + nome
                + "\nNumero de Patas: " + nPatas
                + "\nCor: " + cor
                + "\nNumero de Barbatanas: " + nBarbatanas
                + "\n}\n";
    }
}
