import java.util.Scanner;

/**
 * Faca um programa que leia um numero inteiro N e depois imprima os N primeiros
 * numeros naturais impares.
 */
public class Desafio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) if (i % 2 != 0) System.out.print(i + " ");

        scanner.close();
    }
}
