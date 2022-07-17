import java.util.Scanner;

/**
 * Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius. A
 * formula de conversao eh: C = K - 273.15, sendo C a temperatura em Celsius e K a
 * temperatura em Kelvin.
 */
public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Kelvin: ");
        double kelvin = scanner.nextDouble();

        double celsius = kelvin - 273.15;

        System.out.println("A temperatura de " + kelvin + " graus Kelvin convertida em Celsius eh: " + celsius + " graus.");

        scanner.close();
    }
}
