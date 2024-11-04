package aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        c.abrirMenu();
        
        c.desligar();
        c.maisVolume();
        c.abrirMenu();
        
        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenu();
        c.menosVolume();
        c.abrirMenu();
    }
    
}
