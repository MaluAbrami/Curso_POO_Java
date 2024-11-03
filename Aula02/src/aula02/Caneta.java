package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    /*
    Observação: 'this' é o nome do objeto que chamou, ou seja, 
    quando usamos o 'this' ele basicamente representa o objeto
    do momento, por exemplo: se meu objeto do main() ter nome
    'c1' e chamar o método tampar() da classe, o 'this' será 
    o próprio 'c1' e pegará o seu próprio atributo 'tampada'
    */
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ela esta tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Nao posso rabiscar");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
