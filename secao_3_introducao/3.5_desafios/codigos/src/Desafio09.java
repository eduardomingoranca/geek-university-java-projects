import java.util.Scanner;

/**
 * Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin. A
 * formula de conversao eh: K = C + 273.15, sendo C a temperatura em Celsius e K a
 * temperatura em Kelvin
 */
public class Desafio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;

        System.out.println("A temperatura de " + celsius + " graus Celsius convetida em Kelvin eh: " + kelvin + " graus.");

        scanner.close();
    }
}
