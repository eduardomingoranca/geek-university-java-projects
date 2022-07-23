import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Faca um programa que leia um numero e, caso ele seja positivo, calcule e mostre:
 *          * O numero digitado ao quadrado
 *          * A raiz quadrada do numero digitado
 */
public class Desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println(pow(numero, 2));
            System.out.println(sqrt(numero));
        } else {
            System.out.println("Numero invalido, informe um numero positivo!");
        }

        scanner.close();
    }
}
