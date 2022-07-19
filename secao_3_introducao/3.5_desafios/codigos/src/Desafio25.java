import java.util.Scanner;

/**
 * Leia um valor de area em acres e apresente-o convertido em metros quadrados m2. A
 * formula de conversao eh: M = A * 4048.58, sendo M a area em metros quadrados e A a
 * area em acres.
 */
public class Desafio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a area em acres: ");
        double acres =  scanner.nextDouble();

        double metrosQuadrados = acres * 4048.58;

        System.out.println("A area de " +  acres + " acres em metros quadrados eh: " + metrosQuadrados + " metros quadrados.");

        scanner.close();
    }
}
