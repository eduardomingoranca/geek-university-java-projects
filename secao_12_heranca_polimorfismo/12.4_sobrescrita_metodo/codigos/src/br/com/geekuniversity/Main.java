package br.com.geekuniversity;

/**
 * Sobrescrita de Metodo
 * - Overriding
 * Ocorre quando sobrescreve metodos da classe pai (super classe) em classes filhas.
 */
public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Edward Wheeler", 1997, "edwardwheeler@mail.com", "ABC123");
        System.out.println(aluno);

        Professor professor = new Professor("Joshua Stewart", 1973, "joshstew@mail.com", "AB21435");
        System.out.println(professor);
    }
}
