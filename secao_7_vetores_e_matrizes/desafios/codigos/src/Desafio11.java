import java.util.Scanner;

/**
 * Faca um programa que preencha um vetor com 10 numeros reais, calcule e mostre a
 * quantidade de numeros negativos e a soma dos numeros positivos desse vetor.
 */
public class Desafio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[10];

        int negativo = 0;
        double soma = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + i + "] numero: ");
            vet[i] = scanner.nextDouble();

            if (vet[i] < 0) negativo++;
            else soma += vet[i];
        }

        System.out.println("===============================");
        System.out.println("TOTAL DE NEGATIVOS: " + negativo);
        System.out.println("SOMA: " + soma);
        System.out.println("===============================");

        scanner.close();
    }
}
