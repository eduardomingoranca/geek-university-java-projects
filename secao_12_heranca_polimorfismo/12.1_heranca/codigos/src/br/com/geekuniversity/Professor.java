package br.com.geekuniversity;

public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, int anoNascimento, String email, String matricula) {
        super(nome, anoNascimento, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
