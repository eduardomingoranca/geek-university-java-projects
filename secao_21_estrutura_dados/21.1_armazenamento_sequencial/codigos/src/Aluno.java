public class Aluno {

    private final String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        Aluno outro = (Aluno) o;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
