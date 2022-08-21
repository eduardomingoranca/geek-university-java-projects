import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

/**
 * Faca um programa que receba do usuario um vetor com 10 posicoes. Em seguida devera
 * ser impresso o maior e o menor elemento do vetor.
 */
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[10];
        double maior = MIN_VALUE;
        double menor = MAX_VALUE;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero: ");
            vet[i] = scanner.nextDouble();
        }

        for (double num: vet) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("MAIOR: " + maior + " | MENOR: " + menor);

        scanner.close();
    }
}
