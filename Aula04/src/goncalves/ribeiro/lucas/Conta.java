package goncalves.ribeiro.lucas;

public class Conta {
    //Atributos da classe
    private Cliente cliente;
    private double saldo;
    private int numero;

    //Métodos da classe

    //Construtor da Classe
    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;

    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saldo restante: R$" + this.saldo);
            return true;
        }
        System.out.println("Saldo Insuficiente!");
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Operação realizada!");
            return true;
        }
        System.out.println("Falha na operação!");
        return false;
    }

    public void visualizarSaldo(){
        System.out.println("Saldo = R$ " + this.saldo);
    }

}
