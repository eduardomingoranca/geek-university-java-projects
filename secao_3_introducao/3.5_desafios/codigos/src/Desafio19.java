import java.util.Scanner;

/**
 * Leia um valor de volume em litros e apresente-o convertido em metros cubicos m3. A
 * formula de conversao eh: M = L/1000, sendo L o volume em litros e M o volume em metros
 * cubicos.
 */
public class Desafio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o volume em litros: ");
        double litros = scanner.nextDouble();

        double cubicos = litros/1000;

        System.out.println("O volume de " + litros + " litros em metros cubicos eh: " + cubicos + " m3. ");

        scanner.close();
    }
}
