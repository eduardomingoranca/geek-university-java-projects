import java.util.Arrays;
import java.util.Scanner;

/**
 * Faca um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a
 * interseccao entre os 2 vetores anteriores, ou seja, que contem apenas os numeros
 * que estao em ambos os vetores. Nao deve conter numeros repetidos.
 */
public class Desafio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] v1 = new double[10];
        double[] v2 = new double[v1.length];
        double[] interseccao = new double[v2.length];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            v1[i] = scanner.nextDouble();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            v2[i] = scanner.nextDouble();
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == v2[i]) interseccao[i] = v1[i];
        }

        int n = interseccao.length;
        double[] aux = Arrays.copyOf(interseccao, n); // copia de vet

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < n; j++) {
                if (aux[j] == aux[i]) removidos++;
                else aux[k++] = aux[j];
            }
            n = n - removidos;
        }

        aux = Arrays.copyOf(aux, n);

        for (double auxiliar: aux) System.out.print(" " + auxiliar);

        scanner.close();
    }

}
