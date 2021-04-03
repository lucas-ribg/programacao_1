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

    //atualiza informações
    //<editor-fold desc="setters">
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public void setCPF(String novoCPF) {
        this.CPF = novoCPF;
    }
    //</editor-fold>

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
