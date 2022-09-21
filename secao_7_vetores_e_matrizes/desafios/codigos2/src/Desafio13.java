import java.util.Random;
import java.util.Scanner;

/**
 * Gere matriz 4x4 com valores no intervalo [1,20]. Escreva um programa que transforme
 * a matriz gerada numa matriz triangular interior, ou seja, atribuindo zero a todos os
 * elementos acima da diagonal principal. Imprima a matriz original e a matriz transformada.
 */
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matz = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++)
                matz[i][j] = random.nextInt(20);
        }

        for (int[] ints : matz) {
            for (int j = 0; j < matz.length; j++)
                System.out.print(" " + ints[j]);

            System.out.println();
        }

        System.out.println("===================================");

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                if (i < j) matz[i][j] = 0;
                System.out.print(" " + matz[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
