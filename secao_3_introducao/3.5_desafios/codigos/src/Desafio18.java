import java.util.Scanner;

/**
 * Leia um valor de volume em metros cubicos m3 e apresente-o convertido em litros. A
 * formula de conversao eh: L = 1000 * M, sendo L o volume em litros e M o volume em
 * metros cubicos.
 */
public class Desafio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de volume em metros cubicos: ");
        double cubicos = scanner.nextDouble();

        double litros = 1000 * cubicos;

        System.out.println("O volume de " + cubicos + " metros cubicos em litros eh: " + litros + " litros.");

        scanner.close();
    }
}
