import java.util.Scanner;

/**
 * Faca uma funcao que receba uma matriz 3 x 3 elementos. Calcule e retorne a soma
 * dos elementos que estao abaixo da diagonal principal.
 */
public class Desafio49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matz = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("MATZ[" + i + "][" + j + "]: ");
                matz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("SOMA: " + somaAbaixoDiagonalPrincipal(matz));

        scanner.close();
    }

    private static double somaAbaixoDiagonalPrincipal(double[][] matz) {
        double soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i > j) soma += matz[i][j];
            }
        }

        return soma;
    }

}
