import java.util.Scanner;

/**
 * Leia uma distancia em quilometros e apresente-a convertida em milhas. A formula de
 * conversao eh: M = K/1.61, sendo K a distancia em quilometros e M em milhas.
 */

public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distancia em quilometros: ");
        double quilometros = scanner.nextDouble();

        double milhas = quilometros/1.61;

        System.out.println("A distancia de " + quilometros + " km em milhas eh: " + milhas + " m.");

        scanner.close();
    }
}
