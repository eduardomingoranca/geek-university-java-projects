import java.util.Scanner;

/**
 * Faca uma funcao que retorne o maior fator primo de um numero.
 */
public class Desafio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        System.out.printf("FATOR MAIOR PRIMO DO NUMERO %d EH %d", numero, fatorMaiorPrimo(numero));

        scanner.close();
    }

    private static int fatorMaiorPrimo(int numero) {
        int a = 0;
        for (int i = numero; i > 1; i--) {
            if (numeroPrimo(i)) {
                if (numero % i == 0) {
                    a = i;
                    return a;
                }
            }
        }
        return a;
    }

    private static boolean numeroPrimo(int i) {
        if (i == 1) return false;

        for (int j = 2; j <= i/2; j++)
            if (i % j == 0) return false;

        return true;
    }

}
