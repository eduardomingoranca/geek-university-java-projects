import java.util.Scanner;

/**
 * Faca um programa que calcule e mostre a area de um trapezio. Sabe-se que:
 *  A = (basemaior + basemenor) * altura / 2
 *  Lembre-se a base maior e a base menor devem ser numeros maiores que zero.
 */
public class Desafio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base maior: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Informe a base menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        System.out.println((baseMaior <= 0 || baseMenor <= 0) ? "numero invalido!" : "A area do trapezio eh: " +
                ((baseMaior + baseMenor) * altura) / 2.0);

        scanner.close();
    }
}
