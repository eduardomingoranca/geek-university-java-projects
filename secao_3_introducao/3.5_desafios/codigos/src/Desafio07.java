import java.util.Scanner;

/**
 * Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
 * A formula de conversao eh: C = 5.0 * (F - 32.0)/9.0, sendo C a temperatura em Celsius
 * e F a temperatura em Fahrenheit.
 */
public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5.0 * (fahrenheit - 32.0)/9.0;

        System.out.println("A temperatura de " + fahrenheit + " graus Fahrenheit convertida em Celsius eh: " + celsius + " graus.");

        scanner.close();
    }
}
