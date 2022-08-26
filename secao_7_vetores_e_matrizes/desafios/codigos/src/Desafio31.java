import java.util.Arrays;
import java.util.Scanner;

/**
 * Faca um programa que leia dois vetores de 10 elementos. Crie um vetor que seja a uniao
 * entre os 2 vetores anteriores, ou seja, que contem os numeros dos dois vetores. Nao
 * deve conter numeros repetidos.
 */
public class Desafio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] v1 = new double[10];
        double[] v2 = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero: ");
            v1[i] = scanner.nextDouble();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero: ");
            v2[i] = scanner.nextDouble();
        }

        double[] aux = new double[v1.length + v2.length];

        System.arraycopy(v1, 0, aux, 0, v1.length); // copiando o array v1
        System.arraycopy(v2, 0, aux, 10, v2.length); // copiando o array v2

        int n = aux.length;
        double[] uniao = Arrays.copyOf(aux, n);

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < n; j++) {
                if (uniao[j] == uniao[i]) removidos++;
                else uniao[k++] = uniao[j];
            }
            n = n - removidos;
        }

        uniao = Arrays.copyOf(uniao, n);

        for (double u: uniao) System.out.print(" " + u);

        scanner.close();
    }

}
