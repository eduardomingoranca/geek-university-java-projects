import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca uma funcao que receba por parametro dois valores X e Z. Calcule e retorne o
 * resultado de X(z) para o programa principal.
 */
public class Desafio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        double x = scanner.nextDouble();

        System.out.print("Z: ");
        double z = scanner.nextDouble();

        System.out.println("X(2): " + exponencia(x, z));

        scanner.close();
    }

    private static double exponencia(double x, double z) {
        return pow(x, z);
    }

}
