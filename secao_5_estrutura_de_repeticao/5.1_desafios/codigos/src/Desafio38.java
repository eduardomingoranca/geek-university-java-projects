import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca um programa que calcule o terno pitagorico a,b,c, para o qual a + b + c = 1000. Um
 * terno pitagorico eh um conjunto de tres numeros naturais, a,b,c, para a qual,
 *                       a(2) + b(2) = c(2)
 * Por exemplo,
 *                      3(2) + 4(2) = 9 + 16 = 25 = 5(2)
 */
public class Desafio38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.print("C: ");
        double c = scanner.nextDouble();

        System.out.println((pow(a, 2) + pow(b, 2)) == pow(c, 2) ? "TERNO PITAGORICO!"
                : "NAO EH UM TERNO PITAGORICO!");

        scanner.close();
    }
}
