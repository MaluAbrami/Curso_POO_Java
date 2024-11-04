package aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; //Criamos um vetor para armazenar todos os lutadores que vamos cadastrar
        
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        for(int i = 0; i < l.length; i++){ //Criei um loop para apresentar todos os lutadores
            l[i].apresentar();
        }
        
        l[3].ganharLuta();
        l[3].empatarLuta();
        l[3].status();
    }
    
}
