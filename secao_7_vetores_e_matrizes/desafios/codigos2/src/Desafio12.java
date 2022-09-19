import java.util.Scanner;

/**
 * Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.
 */
public class Desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matz = new double[3][3];
        double[][] transposta = new double[matz[0].length][matz.length];

        for (int i = 0; i < matz.length; i++) {
            for (int j = 0; j < matz.length; j++) {
                System.out.print("MATRIZ[" + i + "][" + i + "]: ");
                matz[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                transposta[i][j] = matz[j][i];
            }
        }

        for (double[] doubles : transposta) {
            for (int j = 0; j < transposta[0].length; j++) {
                System.out.print(doubles[j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
