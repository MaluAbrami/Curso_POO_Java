package aula05;

public class ContaBancaria {
    public int numConta;
    protected String tipo; //'CC' - conta corrente; 'CP' - conta poupança
    private String dono;
    private float saldo; //Se for conta corrente começa com 50 reais, se for conta poupança começa com 150 reais
    private boolean status; //'true' para aberto, 'false' para fechado

    public ContaBancaria() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if("CC".equals(t)){
            this.setSaldo(50);
        } else if("CP".equals(t)){
            this.setSaldo(150);
        }
        
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){ //Não pode ter dinheiro dentro da conta(precisaria sacar todo o dinheiro primeiro), não pode estar devendo
        if(this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada, pois esta com dinheiro");
        } else if(this.getSaldo() < 0) {
            System.out.println("Conta nao pode ser fechada, pois esta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){ //A conta precisa estar aberta(status true) 
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else{
            System.out.println("Erro: impossivel depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v){ //A conta precisa estar aberta(status true), precisa ter o saldo correto em conta
        if(this.isStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                //this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else{
            System.out.println("Erro: impossivel sacar de uma conta fechada");
        }
    }
    
    public void pagarMensal(){ //É cobrada diretamente no saldo do cliente, conta corrente paga 12 reais de mensalidade, conta poupança paga 20 reais de mensalidade
        int v = 0;
        if("CC".equals(getTipo())){
            v = 12;
        } else if("CP".equals(getTipo())){
            v = 20;
        }
        
        if(this.isStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else{
                System.out.println("Saldo insuficiente para pagar mensalidade");
            }
        } else {
            System.out.println("Erro: impossivel cobrar mensalidade de uma conta fechada");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
