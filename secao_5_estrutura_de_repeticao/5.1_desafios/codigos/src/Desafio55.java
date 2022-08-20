import java.util.Scanner;

/**
 * Escreva um programa que leia um inteiro nao negativo n e imprima a soma dos n primeiros
 * nos numeros primos.
 */
public class Desafio55 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            int soma = 0;

            // somando de 1 a n
            for (int i = 1; i <= n; i++) {
                // funcao testa se i eh primo, retorna true se for verdadeiro!
                if (numeroPrimo(i)) soma+=i;
            }
            System.out.println("TOTAL: " + soma);
        }

        scanner.close();
    }

    private static boolean numeroPrimo(int i) {
        // um caso particular! 1 nao eh primo
        if (i == 1) return false;

        //Devemos procurar um divisor de 2 ata a metade do numero. Se nao foi encontrado entao o numero eh primo!
        for (int j = 2; j <= i/2; j++) {
            //Encontrou um divisor diferente de 1 e i. Nao eh primo!
            if (i % j == 0) return false;
        }

        //não encontrou nenhum divisor! Eh primo.
        return true;
    }
}
