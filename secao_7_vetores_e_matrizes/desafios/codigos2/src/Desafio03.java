/**
 * Faca um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
 * coluna de cada elemento. Em seguida, imprima na tela a matriz.
 */
public class Desafio03 {

    public static void main(String[] args) {
        int[][] matz = new int[4][4];

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                matz[i][j] = i * j;
            }
        }

        for (int[] ints : matz) {
            for (int j = 0; j < matz.length; j++)
                System.out.print(" " + ints[j]);

            System.out.println();
        }

    }
}
