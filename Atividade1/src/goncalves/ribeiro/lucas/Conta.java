package goncalves.ribeiro.lucas;

public class Conta {
    //Atributos
    private String idConta;
    private double saldo;
    private Usuario usuario;

    //Métodos
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
    }
    public void transferir()


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
