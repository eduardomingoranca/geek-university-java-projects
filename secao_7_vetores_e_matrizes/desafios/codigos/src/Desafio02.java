import java.util.Scanner;

/**
 * Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
 */
public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[6];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            valores[i] = scanner.nextInt();
        }

        for (int valor: valores) System.out.print(valor + " ");

        scanner.close();
    }
}
