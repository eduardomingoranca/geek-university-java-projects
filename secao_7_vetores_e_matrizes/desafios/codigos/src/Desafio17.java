import java.util.Scanner;

/**
 * Leia um vetor de 10 posicoes e atribua valor 0 para todos os elementos que possuirem
 * valores negativos.
 */
public class Desafio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextDouble();
        }

        for (int j = 0; j < vet.length; j++)
            if (vet[j] < 0) vet[j] = 0;

        for (double v : vet) System.out.print(" " + v);

        scanner.close();
    }
}
