import java.util.Scanner;

/**
 * Faca uma funcao que recebe, por parametro, 2 vetores de 10 elementos inteiros e que
 * calcule e retorne, tambem por parametro, o vetor uniao dos dois primeiros.
 */
public class Desafio59 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] a = new double[10];
        double[] b = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + (i+1) + "]: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + (i+1) + "]: ");
            b[i] = scanner.nextInt();
        }

        System.out.println("\n UNIAO ENTRE OS VETORES");
        uniaoVetor(a, b);

        scanner.close();
    }

    private static void uniaoVetor(double[] a, double[] b) {
        int tamanho = 20;
        double[] c = new double[tamanho];

        for (int i = 0; i < 10; i++) c[i] = a[i];

        for (int i = 0; i < 10; i++) c[i+10] = b[i];

        for (int i = 0; i < 20; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (c[j] == c[i]) {
                    for (int k = j; k < tamanho-1; k++)
                        c[k] = c[k+1];

                    tamanho--;
                }
            }
        }

        for (int i = 0; i < tamanho; i++)
            System.out.print(" " + c[i]);
    }

}
