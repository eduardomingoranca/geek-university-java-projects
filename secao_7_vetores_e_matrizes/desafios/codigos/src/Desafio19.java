import java.util.Scanner;

/**
 * Faca um vetor de tamanho 50 preenchido com o seguinte valor: (i + 5 * i)%(i + 1), sendo
 * i a posicao do elemento no vetor. Em seguida imprima o vetor na tela.
 */
public class Desafio19 {

    public static void main(String[] args) {
        int[] vet = new int[50];

        for (int i = 0; i < 50; i++)
            vet[i] = ((i + (5 * i)) % (i + 1));

        System.out.println("=======================================================================================================================================");
        for (int j = 0; j < 50; j++)
            System.out.print(" " + vet[j]);
        System.out.println();
        System.out.println("=======================================================================================================================================");
    }

}
