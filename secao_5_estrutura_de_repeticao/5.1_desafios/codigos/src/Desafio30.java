import java.util.Scanner;

/**
 * Faca programas para calcular as seguintes sequencias:
 *      1 + 2 + 3 + 4 + 5 + ... + n
 *      1 - 2 + 3 - 4 + 5 + ... + (2n - 1)
 *      1 + 3 + 5 + 7 + ... + (2n - 1)
 */
public class Desafio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) soma += i;
        System.out.println(" SEQUENCIA 1: " + soma);

        for (int i = 1; i <= n; i++) soma += (i - (i + 1));
        System.out.println(" SEQUENCIA 2: " + soma);

        for (int i = 1; i <= n; i+=2) soma += i;
        System.out.println(" SEQUENCIA 3: " + soma);


        scanner.close();
    }
}
