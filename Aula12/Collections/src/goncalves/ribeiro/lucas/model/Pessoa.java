package goncalves.ribeiro.lucas.model;

/**
 *
 */
public class Pessoa {
    final private String nome;
    final private String cpf;

    /**
     * Construtor da classe Pessoa
     * @param nome Nome atribuido a pessoa
     * @param cpf CPF atribuido a pessoa
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Devolve o estado do objeto
     * @return
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
