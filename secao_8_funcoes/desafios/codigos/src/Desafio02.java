import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.LocalDate.now;

/**
 * Faca uma funcao que receba a data atual (dia, mes e ano em inteiro) e exiba-a na tela
 * no formato textual por extenso. Exemplo: Dia: 01/01/2000, Imprimir: 1 de janeiro de
 * 2000
 */
public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        dataTextual(now().getDayOfMonth(), now().getMonthValue(), now().getYear());

        scanner.close();
    }

    private static void dataTextual(int dayOfMonth, int monthValue, int year) {
        switch (monthValue) {
            case 1 -> System.out.println(dayOfMonth + " de janeiro de " + year);
            case 2 -> System.out.println(dayOfMonth + " de fevereiro de " + year);
            case 3 -> System.out.println(dayOfMonth + " de marco de " + year);
            case 4 -> System.out.println(dayOfMonth + " de abril de " + year);
            case 5 -> System.out.println(dayOfMonth + " de maio de " + year);
            case 6 -> System.out.println(dayOfMonth + " de junho de " + year);
            case 7 -> System.out.println(dayOfMonth + " de julho de " + year);
            case 8 -> System.out.println(dayOfMonth + " de agosto de " + year);
            case 9 -> System.out.println(dayOfMonth + " de setembro de " + year);
            case 10 -> System.out.println(dayOfMonth + " de outubro de " + year);
            case 11 -> System.out.println(dayOfMonth + " de novembro de " + year);
            case 12 -> System.out.println(dayOfMonth + " de dezembro de " + year);
            default -> System.out.println("NUMERO INVALIDO!");
        }
    }

}
