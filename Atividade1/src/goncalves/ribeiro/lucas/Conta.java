package goncalves.ribeiro.lucas;

public class Conta {
    //Atributos
    private String idConta;
    private double saldo;
    private Usuario usuario;

    //Métodos
    //acresce o valor na conta
    public void depositar(double valor, Conta conta){
        conta.saldo += valor;
    }
    //subtrai o valor da conta
    public boolean sacar(double valor, Conta conta){
        if(conta.saldo >= valor){
            conta.saldo -= valor;
        }
        return true;
    }
    //acresce o valor de uma conta e subtrai da outra
    public boolean transferir(Conta pagador, Conta recebedor, double valor){
        if (sacar(valor, pagador)){
            depositar(valor, recebedor);
        }
        return true;
    }


    //construtor
    public Conta(String idConta, double saldo, String nome) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuario(nome);
    }

    //retorna o saldo
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "idConta='" + idConta + '\'' +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }
}
