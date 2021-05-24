package goncalves.ribeiro.lucas.model;

/**
 * Classe que representa a instância de uma conta
 */
public class Conta {
    public double saldo;

    /**
     * Construtor da classe que incializa o saldo
     * @param saldo Valor do saldo inicial
     */
    public Conta(double saldo){
        this.saldo = saldo;
    }

    /**
     * Construtor padrão - sem saldo
     */
    public Conta() {
    }

    /**
     * Método que imprime o estado do objeto Conta
     * @return
     */
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
