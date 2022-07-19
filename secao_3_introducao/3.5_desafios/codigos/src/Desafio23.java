import java.util.Scanner;

/**
 * Leia um valor de comprimento em metros e apresente-o convertido em jardas. A formula
 * de conversao eh: J = M/0.01, sendo J o comprimento em jardas e M o comprimento em
 * metros.
 */
public class Desafio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento em metros: ");
        double metros = scanner.nextDouble();

        double jardas = metros/0.01;

        System.out.println("O comprimento de " + metros + " metros em jardas eh: " + jardas + " jardas.");

        scanner.close();
    }
}
