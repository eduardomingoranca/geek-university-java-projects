import java.util.Scanner;

/**
 * Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia
 * da semana correspondente a este numero. Isto eh, domingo se 1, segunda-feira se 2, e
 * assim por diante.
 */
public class Desafio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro correspondente ao dia da semana: ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1 -> System.out.println("domingo");
            case 2 -> System.out.println("segunda-feira");
            case 3 -> System.out.println("terca-feira");
            case 4 -> System.out.println("quarta-feira");
            case 5 -> System.out.println("quinta-feira");
            case 6 -> System.out.println("sexta-feira");
            case 7 -> System.out.println("sabado");
            default -> System.out.println("numero invalido!");
        }

        scanner.close();
    }
}
