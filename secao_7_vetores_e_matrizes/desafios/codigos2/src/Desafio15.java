import java.util.Arrays;
import java.util.Scanner;

/**
 * Leia uma matriz 5 x 10 que se refere respostas de 10 questoes de multipla escolha,
 * referentes a 5 alunos. Leia tambem um vetor de 10 posicoes contendo o gabarito de
 * respostas que podem ser a, b, c ou d. Seu programa devera comparar as respostas de
 * cada candidato com o gabarito e emitir um vetor denominado resultado, contendo a
 * pontuacao correspondente a cada aluno.
 */
public class Desafio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] multiplaEscolha = new String[5][10];
        String[] gabarito = {"a", "b", "c", "a", "b", "c", "a", "b", "c", "a"};
        int pontuacao1 = 0, pontuacao2 = 0, pontuacao3 = 0, pontuacao4 = 0, pontuacao5 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("MATRIZ[" + i + "][" + j + "]: ");
                multiplaEscolha[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (gabarito[i].equals(multiplaEscolha[0][i])) pontuacao1++;
            if (gabarito[i].equals(multiplaEscolha[1][i])) pontuacao2++;
            if (gabarito[i].equals(multiplaEscolha[2][i])) pontuacao3++;
            if (gabarito[i].equals(multiplaEscolha[3][i])) pontuacao4++;
            if (gabarito[i].equals(multiplaEscolha[4][i])) pontuacao5++;
        }

        System.out.println();
        System.out.println(" ALUNO [1] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[0]));
        System.out.println(" PONTUACAO: " + pontuacao1);
        System.out.println();

        System.out.println(" ALUNO [2] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[1]));
        System.out.println(" PONTUACAO: " + pontuacao2);
        System.out.println();

        System.out.println(" ALUNO [3] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[2]));
        System.out.println(" PONTUACAO: " + pontuacao3);
        System.out.println();

        System.out.println(" ALUNO [4] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[3]));
        System.out.println(" PONTUACAO: " + pontuacao4);
        System.out.println();

        System.out.println(" ALUNO [5] ");
        System.out.print(" " + Arrays.toString(multiplaEscolha[4]));
        System.out.println(" PONTUACAO: " + pontuacao5);
        System.out.println();

        scanner.close();
    }
}
