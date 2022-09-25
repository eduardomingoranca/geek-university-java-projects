import java.util.Scanner;

/**
 * Faca uma funcao que receba uma temperatura em graus Celsius e retorne-a convertida
 * em graus Fahrenheit. A formula de conversao eh: F = C * (9.0/5.0) + 32.0, sendo F a
 * temperatura em Fahrenheit e C a temperatura em Celsius.
 */
public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        double c = scanner.nextDouble();

        System.out.println("F = " + converterFahrenheit(c));

        scanner.close();
    }

    private static double converterFahrenheit(double c) {
        return c * (9.0/5.0) + 32.0;
    }

}
