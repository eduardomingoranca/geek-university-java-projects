import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

/**
 * Fazer um programa a para ler 5 valores e, em seguida, mostrar a posicao onde se encontram
 * o maior e o menor valor.
 */
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[5];

        double bigger = MIN_VALUE;
        double smaller = MAX_VALUE;
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextDouble();

            if (vet[i] > bigger) bigger = vet[i];
            if (vet[i] < smaller) smaller = vet[i];
        }

        int posicaoMaior = 0;
        int posicaoMenor = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == bigger) posicaoMaior = i;
            if (vet[i] == smaller) posicaoMenor = i;
        }

        System.out.println("==============================");
        System.out.println("POSICAO MAIOR: " + posicaoMaior);
        System.out.println("POSICAO MENOR: " + posicaoMenor);
        System.out.println("==============================");

        scanner.close();
    }
}
