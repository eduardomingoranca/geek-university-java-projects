import java.util.Scanner;

/**
 * Receba a altura do degrau de uma escada e a altura que o usuario deseja alcancar
 * subindo a escada. Calcule e mostre quantos degraus o usuarios devera subir para atingir
 * seu objetivo.
 */
public class Desafio44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura do degrau da escada (cm): ");
        double degrau = scanner.nextDouble();

        System.out.print("Informe a altura desejada (m): ");
        double altura = scanner.nextDouble();

        double degrais = altura / degrau;

        System.out.println("A altura do degrau eh: " + degrau + " cm.");
        System.out.println("A altura desejada eh: " + altura + " m.");
        System.out.println("Total de degraus para chegar na altura eh: " + degrais);

        scanner.close();
    }
}
