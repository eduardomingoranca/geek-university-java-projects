import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Leia um numero fornecido pelo usuario. Se esse numero for positivo, calcule a raiz
 * quadrada do numero. Se o numero for negativo, mostre uma mensagem dizendo que o
 * numero eh invalido.
 */
public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double numero = scanner.nextDouble();

        System.out.println((numero > 0) ? "Raiz Quadrada: " + sqrt(numero) : "numero invalido!");

        scanner.close();
    }
}
