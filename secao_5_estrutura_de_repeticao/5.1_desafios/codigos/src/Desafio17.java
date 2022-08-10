import java.util.Scanner;

/**
 * Faca um programa que leia um numero inteiro positivo n e calcule a soma dos n primeiros
 * numeros naturais.
 */
public class Desafio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        int soma = 0;

        if (n <= 0) System.out.println("NUMERO INVALIDO!");
        else for (int i = 1; i <= n; i++) soma += i;

        if (n >= 0) System.out.println("SOMA = " + soma);

        scanner.close();

    }

}
