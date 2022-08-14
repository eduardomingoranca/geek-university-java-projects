import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Faca um programa que leia um conjunto nao determinado de valores, um de cada vez, e
 * escreva para cada um dos valores lidos, o quadrado, o cubo e a raiz quadrada. Finalize
 * a entrada de dados com um valor negativo ou zero.
 */
public class Desafio42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        do {
            System.out.print("Informe o valor [valor negativo ou zero para sair]: ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                System.out.println("=============================");
                System.out.println("QUADRADO: " + pow(numero, 2));
                System.out.println("=============================");
                System.out.println("CUBO: " + pow(numero, 3));
                System.out.println("=============================");
                System.out.println("RAIZ QUADRADA: " + sqrt(numero));
                System.out.println("=============================");
            }

        } while(numero > 0);

        System.out.println("FIM");
        scanner.close();
    }
}
