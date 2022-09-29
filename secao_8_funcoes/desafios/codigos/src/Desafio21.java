import java.util.Scanner;

/**
 * Escreva uma funcao para determinar a quantidade de numeros primos abaixo N.
 */
public class Desafio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int n = scanner.nextInt();

        System.out.println("TOTAL DE NUMEROS PRIMOS: " + totalNumeroPrimo(n));

        scanner.close();
    }

    private static int totalNumeroPrimo(int n) {
        int quantidade = 0;

        for (int i = 1; i < n; i++) {
            if (numeroPrimo(i))
                quantidade++;
        }

        return quantidade;
    }


    private static boolean numeroPrimo(int n) {
        if (n == 1) return false;

        for (int j = 2; j <= n/2; j++)
            if (n % j == 0) return false;

        return true;
    }

}
