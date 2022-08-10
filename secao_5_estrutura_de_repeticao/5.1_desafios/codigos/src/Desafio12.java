import java.util.Scanner;

/**
 * Faca um programa que leia um numero inteiro positivo N e imprima todos os numeros
 * naturais de 0 ate N em ordem decrescente.
 */
public class Desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("NUMERO INVALIDO!");
        else for (int i = n; i >= 0; i--) System.out.print(i + " ");

        scanner.close();

    }
}
