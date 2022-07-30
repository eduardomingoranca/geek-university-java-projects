import java.util.Scanner;

/**
 * Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o mes
 * correspondente a este numero. Isto eh, janeiro se 1, fevereiro se 2, e assim por diante.
 */
public class Desafio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Feveiro");
            case 3 -> System.out.println("Marco");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Setembro");
            case 10 -> System.out.println("Outubro");
            case 11 -> System.out.println("Novembro");
            case 12 -> System.out.println("Dezembro");
            default -> System.out.println("Numero Invalido!");
        }

        scanner.close();
    }
}
