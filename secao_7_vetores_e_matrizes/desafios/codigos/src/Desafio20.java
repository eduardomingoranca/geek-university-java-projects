import java.util.Arrays;
import java.util.Scanner;

/**
 * Escreva um programa que leia numeros inteiros no intervalo[0,50] e os armazene em um
 * vetor com 10 posicoes. Preencha um segundo vetor com apenas com os numeros impares
 * do primeiro vetor. Imprima os dois vetores, 2 elementos por linha.
 */
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextInt();

            if (vet[i] < 0 || vet[i] > 50) {
                System.out.println("NUMERO INVALIDO!");
                break;
            }
        }

        int n = vet.length;
        int[] impar = Arrays.copyOf(vet, n);

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < n; j++) {
                if (impar[j] % 2 == 0 && impar[i] % 2 == 0) removidos++;
                else impar[k++] = impar[j];
            }
            n = n - removidos;
        }

        impar = Arrays.copyOf(impar, n);

        for (int i: impar) System.out.print(" " + i);

        scanner.close();
    }

}
