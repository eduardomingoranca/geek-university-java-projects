import java.util.Scanner;

/**
 * Faca uma funcao que receba um vetor de reais e retorne a media dele.
 */
public class Desafio42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();

        double[] vet = new double[n];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("VET[" + (i+1) + "]: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("MEDIA: " + mediaVetor(vet));

        scanner.close();
    }

    private static double mediaVetor(double[] vet) {
        double soma = 0;
        for (double v : vet) soma += v;

        return soma / vet.length;
    }

}
