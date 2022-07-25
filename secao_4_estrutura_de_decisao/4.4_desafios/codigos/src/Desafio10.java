import java.util.Scanner;

/**
 * Faca um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
 * peso ideal, utiliando as seguintes formulas (onde h corresponde a altura):
 *          * Homens: (72.7 * h) - 58
 *          * Mulheres: (62.1 * h) - 44.7
 */
public class Desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        double h = scanner.nextDouble();

        System.out.print("Informe o sexo (f - feminino | m - masculino): ");
        char s = scanner.next().charAt(0);

        double pesoIdeal = (s == 'm') ? (72.7 * h) - 58 : (62.1 * h) - 44.7;

        System.out.println("peso ideal: " + pesoIdeal);

        scanner.close();
    }
}
