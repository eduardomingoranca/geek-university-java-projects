import java.util.Scanner;

/**
 * Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima
 * o vetor, o maior elemento e a posicao que ele se encontra.
 */
public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero inteiro: ");
            vet[i] = scanner.nextInt();
        }

        for (int i : vet) System.out.print(" " + i);

        int maior = 0;

        for (int v: vet) {
            if (v > maior) maior = v;
        }

        System.out.println();
        System.out.print("MAIOR NUMERO: " + maior);

        scanner.close();
    }
}
