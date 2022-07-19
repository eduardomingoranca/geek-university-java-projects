import java.util.Scanner;

/**
 * Leia um valor de massa em quilogramas e apresente-o convertido em litros. A formula
 * de conversao eh: L = K/0.45, sendo K a massa em quilogramas e L a massa em libras.
 */
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a massa em quilogramas: ");
        double quilogramas = scanner.nextDouble();

        double litros = quilogramas/0.45;

        System.out.println("A massa de " + quilogramas + " quilogramas em litros eh: " + litros + " litros. ");

        scanner.close();
    }
}
