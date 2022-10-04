import java.util.Scanner;

/**
 * Faca uma funcao que recebe, por parametro, uma matriz A[4][4] e retorna a soma dos
 * seus elementos.
 */
public class Desafio54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] a = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("SOMA DOS ELEMENTOS DA MATRIZ: " + somaMatriz(a));

        scanner.close();
    }

    private static double somaMatriz(double[][] a) {
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                soma += a[i][j];
        }
        return soma;
    }

}
