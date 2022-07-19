import java.util.Scanner;

/**
 * Leia um valor de comprimento em jardas e apresente-o convertido em metros. A formula
 * de conversao eh: M = 0.91 * J, sendo J o comprimento em jardas e M o comprimento
 * em metros.
 */
public class Desafio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento em jardas: ");
        double jardas = scanner.nextDouble();

        double metros = 0.91 * jardas;

        System.out.println("O comprimento de " + jardas + " jardas em metros eh: " + metros + " metros.");

        scanner.close();
    }
}
