import java.util.Scanner;

/**
 * Faca uma funcao nao-recursiva que receba um numero inteiro positivo impar N e retorne
 * o fatorial duplo desse numero. O fatorial duplo eh definido como o produto de todos os
 * numeros naturais impares de 1 ate algum numero natural impar N. Assim, o fatorial duplo
 * de 5 eh: 5! = 1 * 3 * 5 = 15
 */
public class Desafio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        if (n % 2 == 0 && n <= 0) System.out.println("APENAS NUMERO IMPAR E POSITIVO!");
        else System.out.println(n + "!: " + fatorialDuplo(n));

        scanner.close();
    }

    private static int fatorialDuplo(int n) {
        int f = 1;
        for (int i = 1; i <= n; i+=2) f *= i;
        return f;
    }

}
