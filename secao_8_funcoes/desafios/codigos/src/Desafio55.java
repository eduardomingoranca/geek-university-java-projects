import java.util.Scanner;

/**
 * Faca uma funcao que recebe, por parametro, uma matriz A[3][3] e retorna a soma dos
 * elementos da sua diagonal principal e da sua diagonal secundaria.
 */
public class Desafio55 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] a = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextDouble();
            }
        }

        somaDiagonalPrincipalESecundaria(a);

        scanner.close();
    }

    private static void somaDiagonalPrincipalESecundaria(double[][] a) {
        double somaDiagonalPrincipal = 0;
        double somaDiagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) somaDiagonalPrincipal += a[i][j];
                else if (i + j == a.length - 1) somaDiagonalSecundaria += a[i][j];
            }
        }

        System.out.println("SOMA DIAGONAL PRINCIPAL: " + somaDiagonalPrincipal);
        System.out.println("SOMA DIAGONAL SECUNDARIA: " + somaDiagonalSecundaria);
    }

}
