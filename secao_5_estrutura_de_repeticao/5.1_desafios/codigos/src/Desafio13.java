import java.util.Scanner;

/**
 * Faca um programa que leia um numero inteiro positivo par N e imprima todos os numeros
 * pares de 0 ate N em ordem crescente
 */
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        if (n % 2 != 0 || n <= 0) System.out.println("NUMERO INVALIDO!");
        else for (int i = 0; i <= n; i++) if (i % 2 == 0) System.out.print(i + " ");

        scanner.close();

    }
}
