import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca uma funcao que receba um inteiro N como parametro, calcule e retorne o resultado
 * da seguinte serie:
 *  S = 2/4 + 5/5 + 10/6 + ... + (N(2) + 1) / (N + 3)
 */
public class Desafio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int n = scanner.nextInt();

        serie(n);

        scanner.close();
    }

    private static void serie(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++)
            s += (pow(n, 2) + 1) / (n + 3);

        System.out.println("S = " + s);
    }

}
