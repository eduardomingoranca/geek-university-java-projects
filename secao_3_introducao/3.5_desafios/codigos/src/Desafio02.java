import java.util.Scanner;

/**
 * Faca um programa que leia um numero real e o imprima.
 */

public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero real: ");
        double numero = scanner.nextDouble();

        System.out.println("O numero informado foi: " + numero);

        scanner.close();
    }
}
