import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca um programa que calcule a diferenca entre a soma dos quadrados dos primeiros
 * 100 numeros naturais e o quadrado da soma. Ex: A soma dos quadrados dos dez primeiros
 * numeros os naturais eh,
 *                          1(2) + 2(2) + ... + 10(2) = 385
 * O quadrado da soma dos dez primeiros numeros naturais eh.
 *                      (1 + 2 + ... + 10)(2) = 552 = 3025
 * A diferenca entre a soma dos quadrados dos dez primeiros numeros naturais e o quadrado
 * da soma eh 3025 - 385 = 2640.
 */
public class Desafio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaQuadrado = 0;
        double quadradoSoma = 0;

        for (int i = 1; i <= 100; i++) {
            somaQuadrado += pow(i, 2);
            quadradoSoma += i;
        }

        System.out.printf("DIFERENCA: %.0f", (pow(quadradoSoma, 2) - somaQuadrado));

        scanner.close();
    }
}
