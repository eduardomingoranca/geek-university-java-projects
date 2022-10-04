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

        System.out.println(dataTextual(now().getDayOfMonth(), now().getMonthValue(), now().getYear()));

        scanner.close();
    }

    private static String dataTextual(int dayOfMonth, int monthValue, int year) {
        String data = "";
        switch (monthValue) {
            case 1 -> data = dayOfMonth + " de janeiro de " + year;
            case 2 -> data = dayOfMonth + " de fevereiro de " + year;
            case 3 -> data = dayOfMonth + " de marco de " + year;
            case 4 -> data = dayOfMonth + " de abril de " + year;
            case 5 -> data = dayOfMonth + " de maio de " + year;
            case 6 -> data = dayOfMonth + " de junho de " + year;
            case 7 -> data = dayOfMonth + " de julho de " + year;
            case 8 -> data = dayOfMonth + " de agosto de " + year;
            case 9 -> data = dayOfMonth + " de setembro de " + year;
            case 10 -> data = dayOfMonth + " de outubro de " + year;
            case 11 -> data = dayOfMonth + " de novembro de " + year;
            case 12 -> data = dayOfMonth + " de dezembro de " + year;
            default -> data = "NUMERO INVALIDO!";
        }
        return data;
    }

}
