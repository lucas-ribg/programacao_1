package goncalves.ribeiro.lucas;

public class Conta {
    private String idConta;
    private double saldo;
    private Usuario usuario;

    public Conta(String idConta, int saldo, Usuario usuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuario("Joao", "joao123", "13559212817");
        this.usuario = new Usuario("Marcio", "marcio123", "12559212817");
        this.usuario = new Usuario("Catarina", "saopaulo123", "11559212817");
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
