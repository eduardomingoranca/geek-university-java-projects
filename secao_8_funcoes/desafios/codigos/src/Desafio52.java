import java.util.Scanner;

/**
 * Escreva uma funcao que recebe uma matriz quadrada de ordem N e calcule a sua
 * transposta (se B eh a matriz transposta de A entao aij = bji).
 */
public class Desafio52 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da matriz: ");
        int n = scanner.nextInt();

        double[][] a = new double[n][n];
        double[][] b = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextDouble();
            }
        }

        transposta(a, b, n);

        scanner.close();
    }

    private static void transposta(double[][] a, double[][] b, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                b[j][i] = a[i][j];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
    }

}
