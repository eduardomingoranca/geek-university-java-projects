import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca um funcao nao-recursiva que receba um numero inteiro positivo n e retorne o
 * hiperfatorial desse numero. O hiperfatorial de um numero n, escrito H(n).
 */
public class Desafio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("APENAS NUMERO POSITIVO!");
        else System.out.println("H(" + n + "): " + hiperfatorial(n));

        scanner.close();
    }

    private static int hiperfatorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= pow(i, i);

        return f;
    }

}
