import java.util.Scanner;

/**
 * Crie uma funcao que compara duas strings e que retorna se elas sao iguais ou diferentes.
 */
public class Desafio63 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.print("Informe outra palavra: ");
        String palavra2 = scanner.nextLine();

        if (comparaString(palavra, palavra2)) System.out.println("PALAVRAS IGUAIS!");
        else System.out.println("PALAVRAS DIFERENTES!");

        scanner.close();
    }

    private static boolean comparaString(String palavra, String palavra2) {
        return palavra.equals(palavra2);
    }

}
