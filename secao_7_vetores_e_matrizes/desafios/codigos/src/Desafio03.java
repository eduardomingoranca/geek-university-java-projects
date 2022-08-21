import java.util.Scanner;

/**
 * Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das
 * componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
 * 10 elementos cada. Imprimir todos os conjuntos.
 */
public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] v1 = new double[10];
        double[] v2 = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero: ");
            v1[i] = scanner.nextDouble();

            v2[i] = Math.pow(v1[i], 2);
        }

        System.out.println("=================================");
        for (double numero: v1) System.out.print(numero + " ");
        System.out.println();
        System.out.println("=================================");
        for (double numero: v2) System.out.print(numero + " ");
        System.out.println();
        System.out.println("=================================");

        scanner.close();
    }
}
