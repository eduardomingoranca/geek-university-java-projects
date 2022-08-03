import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.max;

/**
 * Faca um programa que receba dois numeros e mostre qual deles eh o maior.
 */
public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
           System.out.print("Informe o [" + i + "] numero: ");
           int numero = scanner.nextInt();

           numeros.add(numero);
        }

        System.out.println((Objects.equals(numeros.get(0), numeros.get(1))) ? "numeros iguais!"
                : "MAIOR: " + max(numeros.get(0), numeros.get(1)));

        scanner.close();
    }
}
