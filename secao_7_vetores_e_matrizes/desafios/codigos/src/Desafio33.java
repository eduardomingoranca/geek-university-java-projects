import java.util.Arrays;
import java.util.Scanner;

/**
 * Faca um programa que leia um vetor de 15 posicoes e o compacte, ou seja, elimine as
 * posicoes com valor zero. Para isso, todos os elementos a frente do valor zero, devem
 * ser movidos uma posicao para tras no vetor.
 */
public class Desafio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[15];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o (" + (i + 1) + ") numero: ");
            vet[i] = scanner.nextDouble();
        }

        int n = vet.length;
        double[] aux = Arrays.copyOf(vet, n);

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < n; j++) {
                if (aux[j] == 0 && aux[i] != 0) removidos++;
                else aux[k++] = aux[j];
            }
            n = n - removidos;
        }

        aux = Arrays.copyOf(aux, n);

        for (double a: aux) System.out.print(" " + a);

        scanner.close();
    }

}
