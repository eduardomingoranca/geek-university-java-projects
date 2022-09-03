import java.util.Scanner;

/**
 * Escreva um programa que leia um numero inteiro positivo n e em seguida imprima n
 * linhas do chamado Triangulo de Pascal:
 *      1
 *      1  1
 *      1  2  1
 *      1  3  3  1
 *      1  4  6  4  1
 *      1  5  10  10  5  1
 *      ...
 */
public class Desafio39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));

            System.out.println();
        }

        scanner.close();
    }

    private static int factorial(int i) {
        if (i == 0) return 1;
        return i * factorial(i - 1);
    }

}
