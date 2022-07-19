import java.util.Scanner;

/**
 * Leia um valor de comprimento em polegadas e apresente-o convertido em centimetros.
 * A formula de conversao eh: C = P * 2.54, sendo C o comprimento em centimetros e P o
 * comprimento em polegadas.
 */
public class Desafio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de comprimento em polegadas: ");
        double polegadas = scanner.nextDouble();

        double centimetros = polegadas * 2.54;

        System.out.println("O comprimento de " + polegadas + " polegadas em centimentos eh: " + centimetros + " centimetros. ");

        scanner.close();
    }
}
