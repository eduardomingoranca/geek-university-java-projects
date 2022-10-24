package br.com.geekuniversity;
// Heranca
public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Peter Middlethorpe",  1987, "petermiddlethorpe@mail.com");

        System.out.println(p1.getNome());

        Aluno a1 = new Aluno("Hyacinth Trowbridge", 2001, "hyacintht@mail.com", "123456");

        System.out.println(a1.getNome());

        Professor prof1  = new Professor("Peter Huxley", 1976, "peterhuxley@mail.com", "ABC987");

        System.out.println(prof1.getNome());
    }
}
