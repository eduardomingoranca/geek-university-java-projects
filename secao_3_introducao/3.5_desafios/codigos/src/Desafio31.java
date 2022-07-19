import java.util.Scanner;

/**
 * Leia um numero inteiro e imprima o seu antecessor e o seu sucessor.
 */
public class Desafio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O numero " + numero + " seu antecessor eh: " + antecessor
                + " e o sucessor eh: " + sucessor);

        scanner.close();
    }
}
