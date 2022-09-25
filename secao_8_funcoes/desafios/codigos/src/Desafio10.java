import java.util.Scanner;

import static java.lang.Math.max;

/**
 * Faca uma funcao que receba dois numeros e retorne qual deles eh o maior.
 */
public class Desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int a = scanner.nextInt();

        System.out.print("Informe o segundo numero: ");
        int b = scanner.nextInt();

        System.out.println("MAIOR: " + maior(a, b));
        scanner.close();
    }

    private static int maior(int a, int b) {
        return max(a, b);
    }

}
