import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Faca uma funcao e um programa de teste para o calculo do volume de uma esfera.
 * Sendo que o raio eh passado por parametro.
 * V = 4/3 * pi * R(3)
 */
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio: ");
        double r = scanner.nextDouble();

        System.out.println("V = " + volumeEsfera(r));

        scanner.close();
    }

    private static double volumeEsfera(double r) {
        return 4.0 / 3.0 * PI * pow(r, 3);
    }

}
