import java.util.Scanner;

/**
 * Faca uma funcao que recebe, por parametro, uma matriz A[7][6] e uma linha N e retorne
 * a soma dos elementos dessa linha.
 */
public class Desafio56 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] a = new double[7][6];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Informe a linha a ser somada: ");
        int n = scanner.nextInt();

        if (n < 0 || n > 6) System.out.println("LINHA INVALIDA!");
        else System.out.println("SOMA DA LINHA " + n + " EH: " + somaLinha(a, n));

        scanner.close();
    }

    private static double somaLinha(double[][] a, int n) {
        double soma = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (n == i) soma += a[i][j];
            }
        }

        return soma;
    }

}
