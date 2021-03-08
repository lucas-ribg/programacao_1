package goncalves.ribeiro.lucas;

public class Conta {
    //Atributos da classe
    Cliente cliente;
    double saldo;
    int numero;

    //Métodos da classe
    void depositar(double valor){
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

    boolean transferirDinheiro(Conta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            System.out.println("Operação realizada!");
            return true;
        }
        System.out.println("Falha na operação!");
        return false;
    }

    void visualizarSaldo(){
        System.out.println("Saldo = R$ " + this.saldo);
    }
}
