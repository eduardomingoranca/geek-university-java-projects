import java.util.Scanner;

/**
 * Faca uma funcao que receba como parametro um vetor X de 30 elementos inteiros e
 * retorne, tambem por parametro, dois vetores A e B. O vetor A deve conter os elementos
 * pares de X e o vetor B, os elementos impares.
 */
public class Desafio44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[30];

        for (int i = 0; i < x.length; i++) {
            System.out.print("X[" + (i+1) + "]: ");
            x[i] = scanner.nextInt();
        }

        elementosParImparVetores(x);

        scanner.close();
    }

    private static void elementosParImparVetores(int[] x) {
        int[] a = new int[x.length];
        int[] b = new int[x.length];

        for (int i = 0; i < a.length; i++)
            if (x[i] % 2 == 0) a[i] = x[i];

        for (int i = 0; i < b.length; i++)
            if (x[i] % 2 != 0) b[i] = x[i];

        System.out.println(" |  VETOR A  |");
        for (int j : a) if (j != 0) System.out.print(" " + j);

        System.out.println("\n |  VETOR B  |");
        for (int j : b) if (j != 0) System.out.print(" " + j);
    }
}
