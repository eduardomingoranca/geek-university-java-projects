import java.util.Scanner;

/**
 * Leia um valor de massa em libras e apresente-o convertido em quilogramas. A formula
 * de conversao eh: K = L * 0.45, sendo K a massa em quilogramas e L a massa em libras.
 */
public class Desafio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a massa em libras: ");
        double libras = scanner.nextDouble();

        double quilogramas = libras * 0.45;

        System.out.println("A massa de " + libras + " libras em quilogramas eh: " + quilogramas + " quilogramas.");

        scanner.close();
    }
}
