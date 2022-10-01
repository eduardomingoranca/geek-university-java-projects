import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca uma funcao nao-recursiva que receba um numero inteiro positivo n e retorne o
 * fatorial exponencial desse numero. Um fatorial exponencial eh um inteiro positivo n
 * elevado a potencia de n - 1, que por sua vez eh elevado a potencia de n - 2 e assim
 * em diante.
 */
public class Desafio38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("APENAS NUMERO POSITIVO!");
        else System.out.println("fx(" + n + "): " + fatorialExponencial(n));

        scanner.close();
    }

    private static int fatorialExponencial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= pow(i, n - i);

        return f;
    }

}
