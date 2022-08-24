import java.util.Scanner;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

/**
 * Faca um programa que leia dez conjuntos de dois valores, o primeiro representando o
 * numero do aluno e o segundo representando a sua altura em metros. Encontre o aluno
 * mais baixo e o mais alto. Mostre o numero do aluno mais baixo e do aluno mais alto,
 * juntamente com suas alturas.
 */
public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] alturaAluno = new double[5];
        int[] numeroAluno = new int[alturaAluno.length];

        for (int i = 0; i < alturaAluno.length; i++) {
            System.out.print("Informe a [" + (i + 1) + "] altura do aluno: ");
            alturaAluno[i] = scanner.nextDouble();
        }

        for (int i = 0; i < alturaAluno.length; i++) {
            System.out.print("Informe a [" + (i + 1) + "] numero do aluno: ");
            numeroAluno[i] = scanner.nextInt();
        }

        double alto = MIN_VALUE;
        double baixo = MAX_VALUE;

        for (double j : alturaAluno) {
            if (j > alto) alto = j;
            if (j < baixo) baixo = j;
        }

        for (int i = 0; i < numeroAluno.length; i++) {
            if (alto == alturaAluno[i]) System.out.println("MAIS ALTO: " + alto + " NUMERO: " + numeroAluno[i]);
            if (baixo == alturaAluno[i]) System.out.println("MAIS BAIXO: " + baixo + " NUMERO: " + numeroAluno[i]);
        }

        scanner.close();
    }

}
