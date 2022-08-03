import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Leia um numero real. Se o numero for positivo imprima a raiz quadrada. Do contrario,
 * imprima o numero ao quadrado.
 */
public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero real: ");
        double numero = scanner.nextDouble();

        System.out.println((numero > 0) ? sqrt(numero) : pow(numero, 2));

        scanner.close();
    }
}
