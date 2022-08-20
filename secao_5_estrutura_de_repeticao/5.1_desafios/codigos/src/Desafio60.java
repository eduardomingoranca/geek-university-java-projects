import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

/**
 * Faca um programa que leia varios numeros, calcule e mostre:
 *   (a) A soma dos numeros digitados
 *   (b) A quantidade de numeros digitados
 *   (c) A media dos numeros digitados
 *   (d) O maior numero digitado
 *   (e) O menor numero digitado
 *   (f) A media dos numeros pares
 * Finalize a entrada de dados caso o usuario informe o valor 0.
 */
public class Desafio60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero, soma = 0, maior = MIN_VALUE, menor = MAX_VALUE, somaPar = 0;
        int i = 1;
        int j = 0;
        int k = 0;
        do {
            System.out.print("Informe o [" + i++ + "] numero: ");
            numero = scanner.nextDouble();

            if (numero != 0) {
                k++;
                if (numero > maior) maior = numero;
                if (numero < menor) menor = numero;
                soma += numero;
                if (numero % 2 == 0) {
                    j++;
                    somaPar += numero;
                }
            }
        } while (numero != 0);

        System.out.println("=============================");
        System.out.println(" SOMA: " + soma);
        System.out.println(" TOTAL: " + k);
        System.out.println(" MEDIA: " + (soma / k));
        System.out.println(" MAIOR: " + maior);
        System.out.println(" MENOR: " + menor);
        System.out.println(" MEDIA PAR: " + (somaPar / j));
        System.out.println("=============================");

        scanner.close();
    }
}
