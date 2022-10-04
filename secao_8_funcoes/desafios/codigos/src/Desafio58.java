import java.util.Scanner;

/**
 * Faca uma funcao que receba, por parametro, duas matrizes quadradas de ordem N, A e
 * B, e retorna uma matriz C, tambem por parametro, que seja o produto matricial de A e B.
 */
public class Desafio58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da matriz: ");
        int n = scanner.nextInt();

        double[][] a = new double[n][n];
        double[][] b = new double[n][n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = scanner.nextDouble();
            }
        }

        produtoMatricial(a, b, n);

        scanner.close();
    }

    private static void produtoMatricial(double[][] a, double[][] b, int n) {
        double[][] c = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
    }


}
