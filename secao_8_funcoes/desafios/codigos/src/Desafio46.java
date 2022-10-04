import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.arraycopy;

/**
 * Crie um programa contendo as seguintes funcoes que recebem um vetor V numeros
 * reais como parametro:
 * >> Impressao normal do vetor
 * >> Impressao inversa
 * >> Funcao que retorna a media aritmetica dos elementos do vetor.
 */
public class Desafio46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();

        double[] v = new double[n];

        for (int i = 0; i < v.length; i++) {
            System.out.print("V[" + (i+1) + "]: ");
            v[i] = scanner.nextDouble();
        }

        System.out.println(" IMPRIME VETOR NORMAL ");
        System.out.print(Arrays.toString(mostraVetor(v)));

        System.out.println("\n IMPRIME VETOR INVERSO ");
        mostraVetorInverso(v);

        System.out.println("\n MEDIA ARITMETICA VETOR: " + mediaAritmeticaVetor(v));

        scanner.close();
    }

    private static double mediaAritmeticaVetor(double[] v) {
        double soma = 0;
        for (double value : v) soma += value;
        return soma / v.length;
    }

    private static void mostraVetorInverso(double[] v) {
        for (int i = v.length - 1; i >= 0; i--)
            System.out.print(" " + v[i]);
    }

    private static double[] mostraVetor(double[] v) {
        double[] vet = new double[v.length];
        arraycopy(v, 0, vet, 0, v.length);
        return vet;
    }

}
