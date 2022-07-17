import java.util.Scanner;

/**
 * Faca um programa que leia um numero inteiro e o imprima
 */

public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("O numero informado foi: " + numero);

        scanner.close();
    }
}
