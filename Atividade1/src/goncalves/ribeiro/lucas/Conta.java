package goncalves.ribeiro.lucas;

public class Conta {
    //Atributos
    private String idConta;
    private double saldo;
    private Usuario usuario;

    //Métodos

    //acresce o valor na conta
    public void depositar(double valor){
        this.saldo += valor;
    }
    //subtrai o valor da conta
    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }
        return true;
    }
    //acresce o valor em uma conta e subtrai da outra
    public boolean transferir(Conta recebedor, double valor){
        if (this.sacar(valor)){
            recebedor.depositar(valor);
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
    //retorna o usuario
    public Usuario getUsuario() {
        return usuario;
    }
    //retorna o idConta
    public String getIdConta() {
        return idConta;
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
