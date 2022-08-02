import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Calcule as raizes da equacao de 2 grau.
 *          Lembrando que:
 *          x = -b +- \//\
 *                  2.a
 *             Onde
 *         /\ = b2 - 4ac
 * E ax2 + bx + c = 0 representa uma equacao de 2 grau.
 * A variavel a tem que ser diferente de zero. Caso seja igual, imprima a mensagem "Nao
 * eh equacao de segundo grau".
 *          * Se /\ < 0, nao existe real. Imprima a mensagem Nao existe raiz.
 *          * Se /\ = 0, existe uma raiz real. Imprima a raiz e a mensagem Raiz unica.
 *          * Se /\ >_ 0, imprima as duas raizes reais.
 */
public class Desafio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("=== EQUACAO DE SEGUNDO GRAU ===");
        System.out.println("===============================");

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.print("C: ");
        double c = scanner.nextDouble();

        if (a == 0)
            System.out.println("nao eh uma equacao de segundo grau!");
        else {
            double delta = pow(b, 2) - (4.0 * a * c);
            double x1 = (-b + sqrt(delta)) / (2.0 * a);
            double x2 = (-b - sqrt(delta)) / (2.0 * a);

            if (delta < 0.0)
                System.out.println("nao existe raiz!");
            else if (delta == 0)
                System.out.println("x1: " + x1);
            else if (delta > 0)
                System.out.println("x1: " + x1 + " | x2: " + x2);
        }

        scanner.close();
    }
}
