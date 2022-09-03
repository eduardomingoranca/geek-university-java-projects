import java.util.Scanner;

/**
 * Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma:
 * A[i][j] = 2i + 7j - 2 se i < j;
 * A[i][j] = 3i2 - 1 se i = j;
 * A[i][j] = 4i3 - 5j2 + 1 se i > j
 */
public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[10][10];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i < j) a[i][j] = 2 * i + 7 * j - 2;
                else if (i == j) a[i][j] = 3 * (int) Math.pow(i, 2) - 1;
                else a[i][j] = 4 * (int) Math.pow(i, 3) - 5 * (int) Math.pow(j, 2) + 1;
            }
        }

        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++)
                System.out.print(" " + ints[j]);

            System.out.println();
        }

        scanner.close();
    }
}
