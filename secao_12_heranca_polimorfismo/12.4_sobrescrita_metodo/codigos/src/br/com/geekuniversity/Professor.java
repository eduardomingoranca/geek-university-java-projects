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

    // Overriding / Sobrescrita de metodo
    @Override
    public String getNome() {
        return "Professor: " + super.getNome();
    }

    // Overriding / Sobrescrita de metodo
    @Override
    public String toString() {
        return super.toString() + "\nMatricula: " + this.matricula;
    }

}
