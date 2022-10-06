import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Faca uma rotina que receba como parametro um vetor de caracteres e seu tamanho.
 * A funcao devera de ler uma string do teclado, caractere por caractere ate o tamanho
 * maximo do vetor seja alcancado.
 */
public class Desafio67 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = parseInt(scanner.nextLine());

        if (tamanho > palavra.length() || tamanho < 1) System.out.println("TAMANHO INVALIDO!");
        else retornaVetorCharacter(palavra, tamanho);

        scanner.close();
    }

    private static void retornaVetorCharacter(String palavra, int tamanho) {
        char[] caracteres = new char[tamanho];
        for (int i = 0; i < tamanho; i++) caracteres[i] = palavra.charAt(i);
        for (char caractere : caracteres) System.out.println(caractere);
    }

}
