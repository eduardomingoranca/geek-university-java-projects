import java.util.Scanner;

/**
 * Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s
 * (metros por segundo). A formula de conversao eh: M = K / 3.6, sendo K a velocidade em
 * km/h e M em m/s.
 */
public class Desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a velocidade em km/h (quilometros por hora): ");
        double velocidade = scanner.nextDouble();

        double metros = velocidade / 3.6;

        System.out.println("A velocidade de " + velocidade + " km/h em metros por segundo eh de: " + metros + " m/s");
        scanner.close();
    }
}
