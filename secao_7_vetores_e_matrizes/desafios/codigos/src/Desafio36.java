import java.util.Scanner;

/**
 * Leia um vetor com 10 numeros reais, ordene os elementos deste vetor, e no final escreva
 * os elementos do vetor ordenado.
 */
public class Desafio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o (" + (i+1) + ") numero: ");
            vet[i] = scanner.nextDouble();
        }

        for (int i = 1; i < vet.length; i++) {
            for (int j = 0; j < vet.length - i; j++) {
                if (vet[j] > vet[j+1]) {
                    double temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }

        for (double v: vet) System.out.print(" " + v);

        scanner.close();
    }

}
