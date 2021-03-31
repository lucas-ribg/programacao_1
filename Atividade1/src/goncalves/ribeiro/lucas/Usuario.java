package goncalves.ribeiro.lucas;

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private String CPF;

    //construtor
    public Usuario(String nome, String senha, String CPF) {
        this.nome = nome;
        this.senha = senha;
        this.CPF = CPF;
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
