import java.util.Scanner;

/**
 * Faca um algoritmo que receba um numero inteiro positivo n e calcule o somatorio de 1
 * ate n.
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("NUMERO INVALIDO!");
        else System.out.println("SOMA: " + somatorio(n));

        scanner.close();
    }

    private static int somatorio(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++)
            soma += i;
        return soma;
    }

}
