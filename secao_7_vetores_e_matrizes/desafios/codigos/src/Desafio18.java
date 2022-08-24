import java.util.Scanner;

/**
 * Faca um programa que leia um vetor de 10 numeros. Leia um numero x. Conte os
 * multiplos de um numero inteiro x num vetor e mostre-os na tela.
 */
public class Desafio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero inteiro: ");
            vet[i] = scanner.nextInt();
        }

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        int multiplo = 0;
        System.out.println(" MULTIPLOS DE " + numero);
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % numero == 0 || vet[i] == 0){
                System.out.print(" " + vet[i]);
                multiplo++;
            }
        }
        System.out.println();
        System.out.println(" TOTAL DE MULTIPLOS: " + multiplo);

        scanner.close();
    }

}
