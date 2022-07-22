import java.util.Scanner;

/**
 * Faca um programa para converter uma letra maiuscula em letra minuscula.
 */
public class Desafio45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma letra maiuscula: ");
        char letra = scanner.next().charAt(0);

        String lowerCase = String.valueOf(letra);

        System.out.println("A letra maiuscula: " + letra + " letra minuscula: " + lowerCase.toLowerCase());

        scanner.close();
    }
}
