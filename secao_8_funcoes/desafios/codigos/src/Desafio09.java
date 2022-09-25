import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Faca uma funcao que receba a altura e o raio de um cilindro circular e retorne o volume
 * do cilindro. O volume de um cilindro circular eh calculado por meio da seguinte formula:
 * V = pi * raio(2) * altura, onde pi = 3.141592.
 */
public class Desafio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura de um cilindro circular: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe a raio de um cilindro circular: ");
        double raio = scanner.nextDouble();

        System.out.println("V = " + volumeCilindro(altura, raio));

        scanner.close();
    }

    private static double volumeCilindro(double altura, double raio) {
        return PI * pow(raio, 2) * altura;
    }

}
