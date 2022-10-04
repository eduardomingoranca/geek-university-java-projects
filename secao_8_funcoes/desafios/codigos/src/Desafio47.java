import java.util.Scanner;

/**
 * Faca uma funcao que receba uma matriz 4 x 4 e retorne quantos valores maiores do que
 * 10 ela possui.
 */
public class Desafio47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matz = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("MATZ[" + i + "][" + j + "]: ");
                matz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("TOTAL MAIOR QUE DEZ: " + valoresMaioresQueDez(matz));

        scanner.close();
    }

    private static int valoresMaioresQueDez(double[][] matz) {
        int maiorDez = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                if (matz[i][j] > 10) maiorDez++;
        }

        return maiorDez;
    }

}
