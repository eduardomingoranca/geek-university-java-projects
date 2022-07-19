import java.util.Scanner;

/**
 * Leia um numero inteiro e imprime a soma do sucessor de seu triplo com o antecessor de
 * seu dobro.
 */
public class Desafio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero inteiro: ");
        int numero = scanner.nextInt();

        int soma = ((numero + 1) * 3) + ((numero - 1) * 2);

        System.out.println("A soma do sucessor de seu triplo com o antecessor de seu dobro eh: " + soma);

        scanner.close();
    }
}
