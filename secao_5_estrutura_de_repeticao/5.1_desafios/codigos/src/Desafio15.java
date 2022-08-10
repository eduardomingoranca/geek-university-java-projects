import java.util.Scanner;

/**
 * Faca um programa que leia um numero inteiro positivo impar N e imprima todos os numeros
 * impares de 1 ate N em ordem crescente
 */
public class Desafio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        if (n % 2 == 0 || n <= 0) System.out.println("NUMERO INVALIDO!");
        else for (int i = 1; i <= n; i++) if (i % 2 != 0) System.out.print(i + " ");

        scanner.close();
    }
}
