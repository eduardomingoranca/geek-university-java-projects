import java.util.Scanner;

/**
 * Determine se um determinaado ano lido eh bissexto. Sendo que um ano eh bissexto se
 * for divisivel por 400 ou se for divisivel por 4 e nao for divisivel por 100. Por exemplo:
 * 1988, 1992, 1996
 */
public class Desafio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = scanner.nextInt();

        System.out.println((ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) ?
                "ano bissexto" : "ano nao bissexto");

        scanner.close();
    }
}
