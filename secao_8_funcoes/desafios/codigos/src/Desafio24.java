import java.util.Scanner;

/**
 * Escreva uma funcao que gera um triangulo de altura e lados n e base 2*n-1. Por exemplo,
 * a saida para n = 6 seria:
 *                              *
 *                            * * *
 *                          * * * * *
 *                        * * * * * * *
 *                      * * * * * * * * *
 *                     * * * * * * * * * *
 */
public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int n = scanner.nextInt();

        triangle(n);

        scanner.close();
    }

    private static void triangle(int n) {
        int total;
        for (int i = 1; i <= n; i++) {
            total = 2 * i - 1;
            if (total == 1) System.out.println("*" + " ");
            else {
                for (int j = 1; j < total; j++)
                    System.out.print("*" + " ");

                System.out.println("*" + " ");
            }
        }
    }

}
