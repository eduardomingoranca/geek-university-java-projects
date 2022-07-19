import java.util.Scanner;

/**
 * Leia um valor de area em metros quadrados m2 e apresente-o convertido em hectares.
 * A formula de conversao eh: H = M * 0.0001, sendo M a area em metros quadrados e H
 * a area em hectares.
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a area em metros quadrados: ");
        double metrosQuadrados = scanner.nextDouble();

        double hectares = metrosQuadrados * 0.0001;

        System.out.println("A area de " + metrosQuadrados + " m2 em hectares eh: " + hectares + " hectares. ");

        scanner.close();
    }
}
