import java.util.Scanner;

/**
 * Crie uma funcao que calcula o comprimento de uma string.
 */
public class Desafio62 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra " + palavra + " tem o tamanho de: " + tamanho(palavra));

        scanner.close();
    }

    private static int tamanho(String palavra) {
        return palavra.length();
    }

}
