import java.util.Scanner;

/**
 * Escreva uma funcao que gera um triangulo lateral de altura 2*n-1 e n largura. Por exemplo,
 * a saida para n = 4 seria:
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * *
 *      * *
 *      *
 */
public class Desafio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scanner.nextInt();

        triangulo(n);

        scanner.close();
    }

    private static void triangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" " + "*");

            System.out.println();
        }

        for (int i = n; i > 1; i--) {
            for (int j = i; j > 1; j--)
                System.out.print(" " + "*");

            System.out.println();
        }
    }

}
