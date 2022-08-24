import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Faca um programa que calcule o desvio padrao de um vetor v contento n = 10 numeros,
 * onde m eh a media do vetor.
 *          Desvio Padrao = \/1/n-1 (v[i] - m)2
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        double[] vet = new double[n];
        double desvioPadrao = 0.0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextDouble();
        }

        double mean = vet[0];
        for (int i = 0; i < n; i++) mean += vet[i];

        for (int i = 0; i < n; i++)
            desvioPadrao += pow((vet[i] - mean), 2.0);

        double m = sqrt(desvioPadrao / n);

        System.out.println("DESVIO PADRAO: " + m);

        scanner.close();
    }

}
