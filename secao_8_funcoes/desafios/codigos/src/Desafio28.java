import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Faca uma funcao que receba como parametro o valor de um angulo em graus e calcule
 * o valor do cosseno desse angulo usando sua respectiva serie de Taylor.
 */
public class Desafio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o angulo em graus: ");
        double g = scanner.nextDouble();

        // g * 3.141592 / 180.0; // converte graus em radianos
        System.out.println("Cos (" + g + "): " + cosseno(g * PI / 180.0));

        scanner.close();
    }

    private static double cosseno(double v) {
        int cont = 1;
        double potencia1 = 2, potencia2 = 4;
        double somaPositiva = 0.0, somaNegativa = 0.0;

        do {
            somaPositiva -= pow(v, potencia1) / fatorial(potencia1); // serie de Taylor
            potencia1 += 4;

            somaNegativa += pow(v, potencia2) / fatorial(potencia2); // serie de Taylor
            potencia2 += 4;
            cont++;
        } while (cont < 4);

        return 1 + somaPositiva + somaNegativa;
    }

    private static int fatorial(double a) {
        int f = 1;
        for (int i = 1; i <= a; i++)
            f *= i;

        return f;
    }

}
