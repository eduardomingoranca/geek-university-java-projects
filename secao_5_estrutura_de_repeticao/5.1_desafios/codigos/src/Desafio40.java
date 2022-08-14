import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Elabore um programa que faca leitura de varios numeros inteiros, ate que se digite um
 * numero negativo. O programa tem que retornar o maior e o menor numero lido.
 */
public class Desafio40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int numero;
        do {
            System.out.print("Informe o numero inteiro [numero negativo para sair]: ");
            numero = scanner.nextInt();

            if (numero >= 0) numeros.add(numero);
        } while (numero >= 0);

        int maior = MIN_VALUE;
        int menor = MAX_VALUE;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) maior = numeros.get(i);
            if (numeros.get(i) < menor) menor = numeros.get(i);
        }

        System.out.println("MAIOR NUMERO: " + maior + " MENOR NUMERO: " + menor);

        scanner.close();
    }
}
