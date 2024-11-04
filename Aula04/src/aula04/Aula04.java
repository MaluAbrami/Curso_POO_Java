package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Amarelo", 0.4f);
        c1.status();
        
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();
        
        /*
        //O exemplo abaixo funciona de ambas as maneiras, pois 'modelo' é um atributo PUBLIC
        c1.setModelo("BIC"); //Utilizei o método acessor(set)
        c1.modelo = "BIC"; //Acessei diretamente o atributo
        
        c1.setPonta(0.5f);
        c1.status();
        
        
        A ideia desses métodos('get' e 'set') é proteger os atributos 
        de acessos que são proibidos, dessa forma é possível dar o acesso
        necessário sem o risco de deixar os atributos desprotegidos
        */
    }
    
}
