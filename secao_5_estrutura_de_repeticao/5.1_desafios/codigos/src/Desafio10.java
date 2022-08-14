import java.util.Scanner;

/**
 * Faca um programa que calcule e mostre a soma dos 50 primeiros numeros pares.
 */
public class Desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 50; i++) if (i % 2 == 0) soma += i;

        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}
