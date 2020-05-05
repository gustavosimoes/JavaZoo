package javazoo;

public class JavaZoo {
    
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        
        int aux = 0;
        
        zoo.setNome("CapitolioZoo");
        zoo.setEndereco("MG-050");
        
        Animal[] animais = new Animal[100];
        
        Coruja corujinha = new Coruja();
        
        corujinha.setNome("Bubu");
        corujinha.setnPatas(2);
        corujinha.setCor("Roxa");
        corujinha.setAlturaVoo(30);
        
        animais[aux] = corujinha;
        
        aux++;
        
        Leao leaozinho = new Leao();
        
        leaozinho.setNome("Simba");
        leaozinho.setnPatas(4);
        leaozinho.setCor("Laranja");
        leaozinho.setTamanhoJuba((float) 26.5);
        
        animais[aux] = leaozinho;
        aux++;                
        
        Pato patinho = new Pato();
        
        patinho.setNome("Donald");
        patinho.setnPatas(2);
        patinho.setCor("Branco");
        patinho.setTamanhoBico((float) 8.5);
        
        animais[aux] = patinho;
        
        aux++;
        
        Peixe peixinho = new Peixe();
        
        peixinho.setNome("Peixonauta");
        peixinho.setnPatas(0);
        peixinho.setCor("Laranja");
        peixinho.setnBarbatanas(2);
        
        animais[aux] = peixinho;
        
        zoo.setAnimais(animais);
        
        System.out.println(":::: INFORMAÇÕES ::::\n");
        System.out.println("Zoológico: " + zoo.getNome());
        System.out.println("Localização: " + zoo.getEndereco());
        System.out.println("\n");
        
        System.out.println(":::: Animais ::::\n");
        for (int i = 0; i < 10; i++) {
           if (zoo.getAnimais()[i] != null) {
                System.out.println(zoo.getAnimais()[i].mostraInfo());
                zoo.getAnimais()[i].fazBarulho();
                System.out.println("\n");
            }
        }
    }
    
}
