import java.util.Scanner;

/**
 * Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h
 * (quilometros por hora). A formula de conversao eh: K = M * 3.6, sendo K a velocidade
 * em km/h e M em m/s.
 */
public class Desafio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a velocidade em m/s (metros por segundo): ");
        double metros = scanner.nextDouble();

        double velocidade = metros * 3.6;

        System.out.println("A velocidade de " + metros + " m/s (metros por segundo) em quilometros por hora eh de: " + velocidade + " km/h. ");
        scanner.close();
    }
}
