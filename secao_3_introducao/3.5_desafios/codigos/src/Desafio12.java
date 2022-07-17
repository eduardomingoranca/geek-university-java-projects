import java.util.Scanner;

/**
 * Leia uma distancia em milhas e apresente-a convertida em quilometros. A formula de
 * conversao eh: K = 1.61 * M, sendo K a distancia em quilometros e M em milhas.
 */
public class Desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distancia em milhas: ");
        double milhas = scanner.nextDouble();

        double quilometros = 1.61 * milhas;

        System.out.println("A distancia de " + milhas + " milhas em quilometros eh de: " + quilometros + " km.");

        scanner.close();
    }
}

