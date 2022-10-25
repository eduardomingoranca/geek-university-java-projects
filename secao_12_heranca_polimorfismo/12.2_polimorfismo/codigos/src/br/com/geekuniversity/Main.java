package br.com.geekuniversity;
/**
 * Polimorfismo
 * - Poli - muitas
 * - Morfismo  - formas
 * <p>
 * Objetos do mesmo tipo, podem agir de formas diferentes.
 */
public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Peter Middlethorpe",  1987,
                "petermiddlethorpe@mail.com");
        System.out.println(p1);
        System.out.println(p1.getNome());
        System.out.println();

        Aluno a1 = new Aluno("Hyacinth Trowbridge", 2001,
                "hyacinthtrowbridge@mail.com", "123456");
        System.out.println(a1);
        System.out.println(a1.getNome());
        System.out.println();

        Professor prof1  = new Professor("Peter Huxley", 1976,
                "peterhuxley@mail.com", "ABC987");
        System.out.println(prof1);
        System.out.println(prof1.getNome());
    }
}
