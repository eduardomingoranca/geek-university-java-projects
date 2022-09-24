import java.util.Arrays;
import java.util.Scanner;

/**
 * Faca um programa para corrigir uma prova com 10 questoes de multipla escolha (a, b,
 * c, d, ou e), em uma turma com 3 alunos. Cada questao vale 1 ponto. Leia o gabarito, e
 * para cada aluno leia sua matricula (numero inteiro) e suas respostas. Calcule e escreva:
 * Para cada aluno, escreva sua matricula, suas respostas, e sua nota. O percentual de
 * aprovacao, assumindo media 7.0
 */
public class Desafio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] multiplaEscolha = new String[3][10];
        String[] gabarito = {"a", "b", "c", "a", "b", "c", "a", "b", "c", "a"};
        int[] numeroMatricula = new int[3];
        int pontuacao1 = 0, pontuacao2 = 0, pontuacao3 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("MATRIZ[" + i + "][" + j + "]: ");
                multiplaEscolha[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (gabarito[i].equals(multiplaEscolha[0][i])) pontuacao1++;
            if (gabarito[i].equals(multiplaEscolha[1][i])) pontuacao2++;
            if (gabarito[i].equals(multiplaEscolha[2][i])) pontuacao3++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("INFORME O NUMERO DE MATRICULA DO " + (i+1) + " ALUNO: ");
            numeroMatricula[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println(" ALUNO [1] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[0]));
        System.out.println("\n NUMERO MATRICULA: " + numeroMatricula[0]);
        System.out.println(pontuacao1 >= 7 ? " APROVADO " : " REPROVADO ");

        System.out.println();
        System.out.println(" ALUNO [2] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[1]));
        System.out.println("\n NUMERO MATRICULA: " + numeroMatricula[1]);
        System.out.println(pontuacao2 >= 7 ? " APROVADO " : " REPROVADO ");

        System.out.println();
        System.out.println(" ALUNO [3] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[2]));
        System.out.println("\n NUMERO MATRICULA: " + numeroMatricula[2]);
        System.out.println(pontuacao3 >= 7 ? " APROVADO " : " REPROVADO ");

        scanner.close();
    }
}
