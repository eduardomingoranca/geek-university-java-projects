/**
 * Declara uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
 * elementos. Escreva ao final a matriz obtida.
 */
public class Desafio02 {

    public static void main(String[] args) {
        int[][] matz = new int[5][5];

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                if (i == j) matz[i][j] = 1;
                else matz[i][j] = 0;
            }
        }

        for (int[] ints : matz) {
            for (int j = 0; j < matz.length; j++)
                System.out.print(" " + ints[j]);

            System.out.println();
        }

    }
}
