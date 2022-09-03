import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

/**
 * Leia uma matriz 4 x 4, imprima a matriz e retorne a localizacao (linha e a coluna) do
 * maior valor.
 */
public class Desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matz = new int[4][4];

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                System.out.print("MATRIZ [" + i + "][" + j + "]: ");
                matz[i][j] = scanner.nextInt();
            }
        }

        for (int[] ints : matz) {
            for (int j = 0; j < matz.length; j++)
                System.out.print(" " + ints[j]);

            System.out.println();
        }

        System.out.println();

        int maior = MIN_VALUE;
        int posicaoI = 0, posicaoJ = 0;

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                if (matz[i][j] > maior) {
                    maior = matz[i][j];
                    posicaoI = i;
                    posicaoJ = j;
                }
            }
        }

        System.out.println(" MAIOR: " + maior + " | POSICAO: [" + posicaoI + "][" + posicaoJ + "]");

        scanner.close();
    }
}
