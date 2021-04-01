package goncalves.ribeiro.lucas;

public class Usuario {
    //Atributos
    private String nome;
    private String senha;
    private String email;
    private String CPF;

    //retorna o nome
    public String getNome() {
        return nome;
    }

    //construtor
    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
