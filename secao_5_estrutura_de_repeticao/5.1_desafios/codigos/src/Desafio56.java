import java.util.Scanner;

/**
 * Faca um programa que calcule a soma de todos os numeros primos abaixo de dois
 * milhoes.
 */
public class Desafio56 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i < 2000000; i++) {
            if (numeroPrimo(i)) soma+=i;
        }

        System.out.println("TOTAL: " + soma);
        scanner.close();
    }

    private static boolean numeroPrimo(int i) {
        if (i == 1) return false;

        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) return false;
        }

        return true;
    }
}
