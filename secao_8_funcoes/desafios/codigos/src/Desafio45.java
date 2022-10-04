import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Faca uma funcao que calcule o desvio padrao de um vetor v contendo n numeros
 * Desvio Padrao = \/1/n-1 (v[i] - m)2.
 */
public class Desafio45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < v.length; i++) {
            System.out.print("V[" + (i+1) + "]: ");
            v[i] = scanner.nextInt();
        }

        System.out.println(" DESVIO PADRAO: " + desvioPadrao(n, v));

        scanner.close();
    }

    private static double desvioPadrao(int n, int[] v) {
        int s = 0;
        for (int k : v) s += k;

        double sigma = 0;
        for (int j : v) sigma = pow(j - (double) s / v.length, 2.0);

        return sqrt(1.0 / n * sigma);
    }

}
