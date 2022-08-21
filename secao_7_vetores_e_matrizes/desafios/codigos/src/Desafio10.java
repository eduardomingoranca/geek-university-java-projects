import java.util.Scanner;

/**
 * Faca um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
 * e imprima a media geral.
 */
public class Desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[15];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a [" + (i+1) + "] nota: ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        System.out.println("=========================");
        System.out.println("    BOLETIM ESCOLAR      ");
        System.out.println("=========================");
        for (double nota : notas) {
            System.out.print(" " + nota);
            soma += nota;
        }
        System.out.println();
        System.out.println("=========================");
        System.out.println(" MEDIA DAS NOTAS: " + (soma / notas.length));

        scanner.close();
    }
}
