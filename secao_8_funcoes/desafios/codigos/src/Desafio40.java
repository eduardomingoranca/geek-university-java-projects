import java.util.Scanner;

/**
 * Faca uma funcao que receba um vetor de inteiros e retorne quantos valores pares ele
 * possui.
 */
public class Desafio40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro positivo: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("APENAS NUMERO POSITIVO MAIOR QUE ZERO!");
        else {
            int[] v = new int[n];

            for (int i = 0; i < v.length; i++) {
                System.out.print("V["+ (i+1) + "]: ");
                v[i] = scanner.nextInt();
            }
            System.out.println("TOTAL DE NUMEROS PARES: " + vetorPares(v));
        }

        scanner.close();
    }

    private static int vetorPares(int[] v) {
        int par = 0;
        for (int j : v) if (j % 2 == 0) par++;
        return par;
    }

}
