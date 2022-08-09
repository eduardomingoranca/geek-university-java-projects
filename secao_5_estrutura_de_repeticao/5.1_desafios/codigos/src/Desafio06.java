import java.util.Scanner;

/**
 * Faca um programa que leia 10 numeros inteiros e imprima sua media.
 */
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o ["+ i + "] numero: ");
            double numero = scanner.nextDouble();

            soma += numero;
        }

        System.out.println("MEDIA = " + (soma / 10.0));

        scanner.close();
    }
}
