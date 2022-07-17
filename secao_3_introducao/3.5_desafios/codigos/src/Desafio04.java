import java.util.Scanner;

/**
 * Leia um numero real e imprima o resultado do quadrado desse numero
 */
public class Desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero real: ");
        double numero = scanner.nextDouble();

        double aoQuadrado = Math.pow(numero, 2);

        System.out.println("O numero " + numero + " ao quadrado eh: " + aoQuadrado);

        scanner.close();
    }
}
