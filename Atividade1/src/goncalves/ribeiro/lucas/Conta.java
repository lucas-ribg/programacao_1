package goncalves.ribeiro.lucas;

public class Conta {
    private String idConta;
    private double saldo;
    private Usuario usuario;

    public Conta(String idConta, double saldo, String usuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuario("Joao");
        this.usuario = new Usuario("Catarina");
        this.usuario = new Usuario("Marcio");
    }

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
