import java.util.Scanner;

/**
 Considere um vetor A com 11 elementos onde A1 < A2 < ... < A6 > A7 > A8 >
 ... > A11, ou seja, esta ordenado em ordem crescente ate o sexto elemento,
 e a partir desse elemento esta ordenado em ordem decrescente. Dado o aor
 da questao anterior, proponha um algoritmo para ordenar os elementos.
 */
public class Desafio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] a = new double[11];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Informe o (" + (i+1) + ") numero: ");
            a[i] = scanner.nextDouble();
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                if (a[j] > a[j+1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                if (a[j+6+1] > a[j+6]) {
                    double temp = a[j+6+1];
                    a[j+6+1] = a[j+6];
                    a[j+6] = temp;
                }
            }
        }

        for (double v: a) System.out.print(" " + v);

        scanner.close();
    }

}
