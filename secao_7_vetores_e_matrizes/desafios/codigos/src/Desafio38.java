import java.util.Scanner;

/**
 * Peca ao usuario para digitar dez valores numericos e ordene por ordem crescente esses
 * valores, guardando-os num vetor. Ordene o valor assim que ele for digitado. Mostre ao
 * final na tela os valores em ordem.
 */
public class Desafio38 {

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
