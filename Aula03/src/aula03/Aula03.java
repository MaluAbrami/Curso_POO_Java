package aula03;

public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        c1.carga = 80; //Esse caso é permitido(PROTECTED), pois ele está dentro de uma classe que utiliza a classe Caneta
        /*
        !! CASO DE ERRO !!
        Ele não permite essa atribuição, pois 'ponta' e 'tamapada' estão definidos com acesso privado(PRIVATE)
        c1.tampada = false;
        c1.ponta = 0.5f;
        */
        
        c1.tampar(); //O atibuto 'tampada' é privada, porém os métodos destampar() e tampar() são públicos e alteram diretamente no atributo 'tampada'
        c1.status();
    }
    
}
