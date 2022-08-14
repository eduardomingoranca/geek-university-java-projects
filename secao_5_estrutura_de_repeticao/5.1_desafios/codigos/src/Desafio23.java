import java.util.Scanner;

/**
 * Faca um algoritmo que leia um numero positivo e imprima seus divisores.
 */
public class Desafio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe um numero inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) System.out.println("NUMERO INVALIDO!");
        else for (int i = 1; i <= numero; i++) if (numero % i == 0) System.out.print(i + " ");

        scanner.close();
    }
}
