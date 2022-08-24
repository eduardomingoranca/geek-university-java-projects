import java.util.Scanner;

/**
 * Faca um programa que receba do usuario dois vetores, A e B, com 10 numeros inteiros
 * cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados
 * do vetor C.
 */
public class Desafio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] a = new double[10];
        double[] b = new double[a.length];
        double[] c = new double[b.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            a[i] = scanner.nextDouble();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            b[i] = scanner.nextDouble();
        }

        for (int k = 0; k < c.length; k++) {
            c[k] = a[k] - b[k];
            System.out.print(" " + c[k]);
        }

        scanner.close();
    }

}
