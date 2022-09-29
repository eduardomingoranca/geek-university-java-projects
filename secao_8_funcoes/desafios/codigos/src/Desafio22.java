import java.util.Scanner;

/**
 * Crie uma funcao que receba como parametro um valor inteiro e gere como saida n linhas
 * com pontos de exclamacao, conforme o exemplo abaixo (para n = 5).
 *  !
 *  ! !
 *  ! ! !
 *  ! ! ! !
 *  ! ! ! ! !
 */
public class Desafio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        floyd(n);

        scanner.close();
    }

    private static void floyd(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" " + "!");

            System.out.println();
        }
    }

}
