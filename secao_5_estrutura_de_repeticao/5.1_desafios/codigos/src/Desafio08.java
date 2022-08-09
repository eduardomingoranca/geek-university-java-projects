import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Escreva um programa que leia 10 numeros e escreva o menor valor lido e o maior valor
 * lido.
 */
public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numeros = new ArrayList<>();

        double maior = MIN_VALUE;
        double menor = MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o ["+ (i + 1) + "] numero: ");
            double numero = scanner.nextDouble();

            numeros.add(numero);
            if (numeros.get(i) > maior) maior = numeros.get(i);
            if (numeros.get(i) < menor) menor = numeros.get(i);
        }

        System.out.println("MAIOR = " + maior + " MENOR = " + menor);

        System.out.println();

        scanner.close();
    }
}
