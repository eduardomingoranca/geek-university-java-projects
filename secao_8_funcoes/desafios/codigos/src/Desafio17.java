import java.util.Scanner;

/**
 * Faca uma funcao que receba dois numeros inteiros positivos por parametro e retorne a
 * soma dos N numeros inteiros existentes entre eles.
 */
public class Desafio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.print("Informe o segundo numero: ");
        int n2 = scanner.nextInt();

        if (n1 < 0 || n2 < 0) System.out.println("NUMERO INVALIDO!");
        else System.out.println("SOMA: " + intervaloSomaNumeros(n1, n2));

        scanner.close();
    }

    private static int intervaloSomaNumeros(int n1, int n2) {
        int soma = 0;
        if (n1 > n2){ for (int i = n2; i <= n1; i++) soma += i; }
        else { for (int i = n1; i <= n2; i++) soma += i; }
        return soma;
    }

}
