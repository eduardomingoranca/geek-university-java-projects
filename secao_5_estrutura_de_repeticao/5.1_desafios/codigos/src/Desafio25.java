import java.util.Scanner;

/**
 * Faca um programa que some todos os numeros naturais abaixo de 1000 que sao multiplos
 * de 3 ou 5.
 */
public class Desafio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        double soma = 0;
        do {
            System.out.print("Informe o numero: ");
            numero = scanner.nextDouble();

            if (numero < 1000) if (numero % 3 == 0 || numero % 5 == 0) soma += numero;
        } while (numero < 1000);

        System.out.println("SOMA DOS MULTIPLOS DE 3 OU 5: " + soma);

        scanner.close();
    }
}
