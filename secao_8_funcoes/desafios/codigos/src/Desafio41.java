import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Faca uma funcao que receba um vetor de inteiros e retorne o maior valor.
 */
public class Desafio41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("VET[" + (i+1) + "]: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("MAIOR VALOR VETOR: " + maiorValorVetor(vet));

        scanner.close();
    }

    private static int maiorValorVetor(int[] vet) {
        int maior = MIN_VALUE;
        for (int j : vet) if (j > maior) maior = j;
        return maior;
    }

}
