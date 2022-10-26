package br.com.geekuniversity;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private String email;

    public Pessoa() { }

    public Pessoa(String nome, int anoNascimento, String email) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Overriding -> sobrescrita de metodo
    @Override
    public String toString() {
        return "nome = '" + nome + '\'' +
                ", anoNascimento = " + anoNascimento +
                ", email = '" + email;
    }

    public void mensagem() {
        System.out.println("Esta eh a minha mensagem...");
    }

    public void mensagem(String msg) {
        System.out.println(msg);
    }

}
