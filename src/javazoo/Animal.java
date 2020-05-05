package javazoo;

public abstract class Animal {

    protected String nome;
    protected int nPatas;
    protected String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public abstract String mostraInfo();
    public abstract void fazBarulho();
    
    
}
