import java.util.Scanner;

/**
 * Faca um programa que peca ao usuario para digitar 10 valores e some-os.
 */
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o [" + i + "] numero: ");
            double numero = scanner.nextInt();

            soma += numero;
        }

        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}
