package goncalves.ribeiro.lucas;

public class Cliente {
    public Cliente(String nome){
        this.nome = nome;
    }
    String nome;
    String sobrenome;
    String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
