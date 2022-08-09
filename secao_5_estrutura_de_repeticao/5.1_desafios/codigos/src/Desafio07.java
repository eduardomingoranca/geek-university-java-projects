import java.util.Scanner;

/**
 * Faca um programa que leia 10 numeros positivos, ignorando nao positivos, e imprima sua media
 */
public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o ["+ i + "] numero: ");
            double numero = scanner.nextDouble();

            if (numero % 2 == 0) {
                soma += numero;
                a++;
            }
        }

        System.out.println("MEDIA = " + (soma / a));

        scanner.close();
    }
}
