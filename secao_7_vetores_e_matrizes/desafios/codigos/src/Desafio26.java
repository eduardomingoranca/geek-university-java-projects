import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Faca um programa que calcule o desvio padrao de um vetor v contento n = 10 numeros,
 * onde m eh a media do vetor.
 *          Desvio Padrao = \/1/n-1 (v[i] - m)2
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int s = 0;
        double sigma = 0;
        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("VET[" + (i+1) + "]: ");
            vet[i] = scanner.nextDouble();
        }

        for (double v : vet) s += v;

        for (double v : vet) sigma = pow(v - (double) s / vet.length, 2.0);

        System.out.println(" DESVIO PADRAO: " + sqrt(1.0 / n * sigma));

        scanner.close();
    }

}
