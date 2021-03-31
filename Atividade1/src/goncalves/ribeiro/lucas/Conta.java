package goncalves.ribeiro.lucas;

public class Conta {
    private String idConta;
    private int saldo;
    private Usuario usuario;

    public Conta(String idConta, int saldo, Usuario usuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuario(nome, senha, CPF);
    }
}
