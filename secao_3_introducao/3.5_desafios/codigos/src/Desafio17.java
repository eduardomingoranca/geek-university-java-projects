import java.util.Scanner;

/**
 * Leia um valor de comprimento em centimetos e apresente-o convertido em polegadas.
 * A formula de conversao eh: P = C/2.54, sendo C o comprimento em centimetros e P o
 * comprimento em polegadas.
 */
public class Desafio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de comprimento em centimetos: ");
        double centimetros = scanner.nextDouble();

        double polegadas = centimetros/2.54;

        System.out.println("O comprimento de " + centimetros + " centimetros em polegadas eh: " + polegadas + " polegadas.");

        scanner.close();
    }
}
