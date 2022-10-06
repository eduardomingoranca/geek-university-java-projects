import java.util.Scanner;

import static java.lang.Character.toUpperCase;

/**
 * Faca uma funcao que dado um caractere qualquer retorne o mesmo caractere sempre
 * em maiusculo.
 */
public class Desafio66 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma letra minuscula: ");
        char c = scanner.next().charAt(0);

        System.out.println(maiusculo(c));

        scanner.close();
    }

    private static char maiusculo(char c) {
        return toUpperCase(c);
    }

}
