import java.util.Scanner;

/**
 * Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos
 * na ordem inversa.
 */
public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[6];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero inteiro: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("============================");
        for (int i = vet.length - 1; i >= 0; i--)
            System.out.print(" " + vet[i]);
        System.out.println("\n============================");

    }
}
