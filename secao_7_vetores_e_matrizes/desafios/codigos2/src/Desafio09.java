import java.util.Scanner;

/**
 * Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao abaixo da
 * diagonal principal.
 */
public class Desafio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] vet = new double[3][3];

        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                System.out.print("MATRIZ [" + i + "][" + j + "]: ");
                vet[i][j] = scanner.nextDouble();
                if (i > j) soma += vet[i][j];
            }
        }

        for (double[] doubles : vet) {
            for (int j = 0; j < vet.length; j++)
                System.out.print(" " + doubles[j]);

            System.out.println();
        }

        System.out.println();
        System.out.println(" SOMA: " + soma);

        scanner.close();
    }
}
