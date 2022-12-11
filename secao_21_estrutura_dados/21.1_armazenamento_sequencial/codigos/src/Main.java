/**
 * Armazenamento Sequencial
 * int numeros[] = new int[5];
 * numeros[0] = 1;
 * numeros[1] = 3;
 * numeros[2] = 5;
 * numeros[3] = 7;
 * numeros[4] = 9;
 */
public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Alice");
        Aluno a2 = new Aluno("Felicity");

        Vetor lista = new Vetor();
        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(a1);
        System.out.println("Total de alunos: " + lista.tamanho());

        lista.adiciona(a2);
        System.out.println("Total de alunos: " + lista.tamanho());

        System.out.println(lista);
        System.out.println(lista.contem(a1));

        try {
            System.out.println(lista.pega(101));
        } catch (IllegalArgumentException e) {
            System.out.println("0 aluno da posicao 101 nao existe.");
            System.out.println(e.getMessage());
        }

        Aluno a3 = new Aluno("Mary");
        try {
            lista.adiciona(101, a3);
        } catch (IllegalArgumentException e) {
            System.out.println("A posicao 101 eh invalida!");
        }

        lista.remove(0);
        System.out.println(lista);
    }

}
