import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Escreve um programa que verifique quais numeros entre 1000 e 9999 (inclusive) possuem
 * a propriedade seguinte: a soma dos dois digitos de mais baixa ordem com os dois digitos
 * de mais alta ordem elevada ao quadrado eh igual ao proprio numero. Por exemplo, para o
 * inteiro 3025, temos que:
 * 30 + 25 = 55
 * 55(2) = 3035
 */
public class Desafio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1000; i <= 9999; i++)
            if (i == pow((i % 100) + (i / 100), 2)) System.out.print(i + " ");

        scanner.close();
    }
}
