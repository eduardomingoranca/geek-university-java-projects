import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

/**
 * Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos
 * juntamente com o maior, o menor e a media dos valores.
 */
public class Desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[5];

        double bigger = MIN_VALUE;
        double smaller = MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextDouble();

            if (vet[i] > bigger) bigger = vet[i];
            if (vet[i] < smaller) smaller = vet[i];
            sum += vet[i];
        }

        System.out.println("==========================");
        System.out.println("MAIOR NUMERO: " + bigger);
        System.out.println("MENOR NUMERO: " + smaller);
        System.out.println("MEDIA DOS NUMEROS: " + (sum / vet.length));
        System.out.println("==========================");

        scanner.close();
    }
}
