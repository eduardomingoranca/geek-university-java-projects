import java.util.Scanner;

/**
 * Faca uma funcao nao-recursiva que receba um numero inteiro positivo n e retorne o
 * fatorial quadruplo desse numero. O fatorial quadruplo de um numero n eh dado por:
 *      (2n)!/n!
 */
public class Desafio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("APENAS NUMERO POSITIVO!");
        else System.out.println("f (" + n + "): " + fatorialQuadruplo(n));

        scanner.close();
    }

    private static int fatorialQuadruplo(int n) {
        int f = 1, f1 = 1, n2 = 2 * n;
        for (int i = 1; i <= n; i++) f *= i;
        for (int i = 1; i <= n2; i++) f1 *= i;
        return f1 / f;
    }

}
