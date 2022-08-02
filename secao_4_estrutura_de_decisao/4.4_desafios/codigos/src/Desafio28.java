import java.util.Scanner;

import static java.lang.Math.exp;
import static java.lang.Math.log;

/**
 * Faca um programa que leia tres numeros inteiros positivos e efetue o calculo de uma das
 * seguintes medias de acordo com um valor numerico digitado pelo usuario:
 *          (a) Geometrica: 3\/x * y * z
 *          (b) Ponderada: x + 2.y + 3.z / 6.0
 *          (c) Harmonica: 1 / 1/x + 1/y + 1/z
 *          (d) Aritmetica: x + y + z / 3.0
 */
public class Desafio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.print("z: ");
        int z = scanner.nextInt();

        if (x <= 0 || y <= 0 || z <= 0)
            System.out.println("informe um numero positivo maior que zero!");
        else {
            System.out.println("=======================================");
            System.out.println("=== [a] Geometrica | [b] Ponderada  ===");
            System.out.println("=== [c] Harmonica  | [d] Aritmetica ===");
            System.out.println("=======================================");

            System.out.print("Informe uma opcao: ");
            char opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'a' -> System.out.println("Geometrica: " + exp((log(x * y * z)) / 3.0));
                case 'b' -> System.out.println("Ponderada: " + (x + (2.0 * y) + (3.0 * z)) / 6.0);
                case 'c' -> System.out.println("Harmonica: " + 1.0 / ((1.0 / x) + (1.0 / y) + (1.0 / z)));
                case 'd' -> System.out.println("Aritmetica: " + (x + y + z) / 3.0);
                default -> System.out.println("opcao invalida!");
            }

        }

        scanner.close();
    }
}
