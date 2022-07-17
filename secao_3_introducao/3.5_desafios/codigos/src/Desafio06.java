import java.util.Scanner;

/**
 * Leia um temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit
 * A formula de conversao eh: F = C * (9.0/5.0) + 32.0, sendo F a temperatura em Fahrenheit
 * e C a temperatura em Celsius.
 */
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * (9.0/5.0) + 32.0;

        System.out.println("A temperatura de " + celsius + " graus Celsius convertida em Fahrenheit eh: " + fahrenheit + " graus.");

        scanner.close();
    }
}
