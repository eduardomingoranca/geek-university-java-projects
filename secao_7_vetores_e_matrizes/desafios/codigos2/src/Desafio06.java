import java.util.Scanner;

/**
  * Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posicao
  * das matrizes lidas.
  */
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] a = new double[4][4];
        double[][] b = new double[4][4];
        double[][] vet = new double[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (b[i][j] > a[i][j]) vet[i][j] = b[i][j];
                else if (a[i][j] > b[i][j]) vet[i][j] = a[i][j];
                else vet[i][j] = a[i][j];
            }
        }

        for (double[] doubles : vet) {
            for (int j = 0; j < vet.length; j++) {
                System.out.print(" " + doubles[j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
