import java.util.Scanner;

/**
 * Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
 */
public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matz = new double[4][4];

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                System.out.print("MATRIZ[" + i + "][" + j + "]: ");
                matz[i][j] = scanner.nextDouble();
            }
        }

        int maiorDez = 0;
        for (double[] doubles : matz) {
            for (int j = 0; j < matz.length; j++) {
                if (doubles[j] > 10) maiorDez++;
            }
        }

        System.out.println("A MATRIZ TEM " + maiorDez + " VALORES MAIOR QUE DEZ.");

        scanner.close();
    }
}
