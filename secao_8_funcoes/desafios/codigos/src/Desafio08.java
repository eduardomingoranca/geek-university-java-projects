import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Sejam a e b os catetos de um triangulo, onde a hipotenusa eh obtida pela equacao:
 * hipotenusa = \/a(2) + b(2). Faca uma funcao que receba os valores de a e b e calcule
 * o valor da hipotenusa atraves da equacao.
 */
public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o cateto A: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o cateto B: ");
        double b = scanner.nextDouble();

        System.out.println("Hipotenusa = " + hipotenusa(a, b));

        scanner.close();
    }

    private static double hipotenusa(double a, double b) {
        return sqrt(pow(a, 2) + pow(b, 2));
    }

}
