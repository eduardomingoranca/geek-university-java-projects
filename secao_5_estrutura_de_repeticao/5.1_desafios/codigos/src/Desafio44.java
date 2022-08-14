import java.util.Scanner;

/**
 * Leia um numero positivo do usuario, entao, calcule e imprima a sequencia Fibonacci ate
 * o primeiro numero superior ao numero lido. Exemplo: se o usuario informou o numero 30,
 * a sequencia a ser impressa sera 0 1 1 2 3 5 8 13 21 34.
 */
public class Desafio44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            int proximo  = 1;
            int anterior = 0;

            for (int i = 1; i <= numero; i++) {
                System.out.print(anterior + " ");
                int fibonacci = anterior + proximo;
                anterior = proximo;
                proximo = fibonacci;
            }

        }

        scanner.close();
    }
}
