package br.com.geekuniversity;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, int anoNascimento, String email,String ra) {
        super(nome, anoNascimento, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return "Aluno: " + super.getNome();
    }

    @Override
    public String toString() {
        return super.toString() + "\nR.A.: " + this.ra;
    }

}
