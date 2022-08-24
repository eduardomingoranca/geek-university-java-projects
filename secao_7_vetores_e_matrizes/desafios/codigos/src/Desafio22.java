import java.util.Scanner;

/**
  Faca um programa que leia dois vetores de 10 posicoes e calcule outro vetor contento
  nas posicoes pares os valores do primeiro e nas posicoes impares os valores do segundo.
 */
public class Desafio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] a = new double[10];
        double[] b = new double[10];
        double[] c = new double[20];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            a[i] = scanner.nextDouble();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            b[i] = scanner.nextDouble();
        }

        for (int i = 0; i < a.length; i++) c[2*i] = a[i];
        for (int i = 0; i < b.length; i++) c[2 * i + 1] = b[i];

        for (double x: c) System.out.print(" " + x);

        scanner.close();
    }

}
