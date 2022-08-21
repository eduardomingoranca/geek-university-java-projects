import java.util.Scanner;

/**
 * Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores
 * lidos na ordem inversa.
 */
public class Desafio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[6];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero inteiro par: ");
            vet[i] = scanner.nextInt();

            if (vet[i] % 2 != 0) {
                System.out.println("NUMERO INVALIDO!");
                break;
            }
        }

        System.out.println("============================");
        for (int j = vet.length - 1; j >= 0; j--)
            System.out.print(" " + vet[j]);
        System.out.println("\n============================");

        scanner.close();
    }
}
