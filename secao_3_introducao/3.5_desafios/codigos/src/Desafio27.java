import java.util.Scanner;

/**
 * Leia um valor de area em hectares e apresente-o convertido em metros quadrados m2.
 * A formula de conversao eh: M = H * 10000, sendo M a area em metros quadrados e H
 * a area em hectares.
 */
public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a area em hectares: ");
        double hectares = scanner.nextDouble();

        double metrosQuadrados = hectares * 10000;

        System.out.println("A area de " + hectares + " hectares em metros quadrados eh: " +
                metrosQuadrados + " m2. ");

        scanner.close();
    }
}
