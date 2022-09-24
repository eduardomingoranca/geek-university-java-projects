import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca um programa que leia uma matriz A de tamanho 3 x 3 e calcule B = A(2)
 */
public class Desafio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        double c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = c++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = pow(a[i][j], 2.0);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
