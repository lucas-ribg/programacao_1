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
        }else{
            System.out.println("Erro!");
            System.out.println("Saldo Insuficiente");
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

    //<editor-fold desc="getters">
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
    //</editor-fold>

    //<editor-fold desc="setters">
    //atualiza informações
    public void setIdConta(String novoIdConta) {
        this.idConta = novoIdConta;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void setUsuario(Usuario novoUsuario) {
        this.usuario = novoUsuario;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Conta{" +
                "idConta='" + idConta + '\'' +
                ", saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }
}
