package aula02;

public class Aula02 {

    public static void main(String[] args) {
        //Instanciando um objeto da classe do tipo Caneta
        Caneta c1 = new Caneta();
        
        //Atribuindo valores para a nossa instância c1
        c1.cor = "Azul"; 
        c1.ponta = 0.5f;
        
        //Chamando o método da classe Caneta
        c1.tampar(); //Está tampada
        c1.rabiscar(); //Portanto não pode rabiscar
        c1.status();
        
        //Instanciando uma segunda caneta
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();//Está destampada
        c2.status();
        c2.rabiscar();//Portanto pode rabiscar
    }
}
