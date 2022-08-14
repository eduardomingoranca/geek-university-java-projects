import java.util.Scanner;

/**
 * Dados n e dois numeros inteiros positivos, i e j, diferentes de 0, imprimir em ordem
 * crescente os n primeiros numeros naturais que sao multiplos de i ou de j e ou de ambos.
 * Exemplo: Para n = 6, i = 2 e j = 3 a saida devera ser: 0,2,3,4,6,8.
 */
public class Desafio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro positivo: ");
        int n = scanner.nextInt();

        System.out.print("i: ");
        int i = scanner.nextInt();

        System.out.print("j: ");
        int j = scanner.nextInt();

        if (n <= 0 || i <= 0 || j <= 0 || i == j) System.out.println("NUMERO INVALIDO!");
        else {
            if (i < j) for (int k = i; k <= j; k++) if (n % k == 0) System.out.print(k + " ");
            else for (int l = j; l <= i; l++) if (n % l == 0) System.out.print(l + " ");
        }


        scanner.close();
    }
}
