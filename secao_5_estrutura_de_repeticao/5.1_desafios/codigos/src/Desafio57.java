import java.util.Scanner;

/**
 * Faca um programa que conte quantos numeros primos existem entre a e b, onde a e b
 * sao numeros informados pelo usuario.
 */
public class Desafio57 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();

        System.out.print("B: ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0 || a == b) System.out.println("NUMERO INVALIDO!");
        else {
            int quantidade = 0;
            for (int i = a; i <= b; i++) {
                if (numeroPrimo(i)) quantidade++;
            }

            System.out.println("TOTAL DE NUMEROS PRIMOS: " + quantidade);
        }

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
