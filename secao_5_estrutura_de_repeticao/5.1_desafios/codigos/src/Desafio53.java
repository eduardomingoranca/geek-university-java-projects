import java.util.Scanner;

/**
 * Escreva um programa que leia um numero inteiro positivo n e em seguida imprima n
 * linhas do chamado Triangulo de Floyd. Para n = 6, temos:
 *
 *      1
 *      2 3
 *      4 5 6
 *      7 8 9 10
 *      11 12 13 14 15
 *      16 17 18 19 20 21
 *
 */
public class Desafio53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            int number = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + number);
                    number++;
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
