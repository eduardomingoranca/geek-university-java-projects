import java.util.Scanner;

/**
 Faca uma funcao que receba um numero N e retorne a soma dos algarismos de N!. Ex:
 se N = 4, N! = 24. Logo, a soma de seus algarismos eh 2 + 4 = 6;
 */
public class Desafio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scanner.nextInt();

        System.out.println(n + "!: " + fatorial(n));
        System.out.println("SOMA ALGARISMOS: " + algarismoFatorial(n));

        scanner.close();
    }

    private static int algarismoFatorial(int n) {
        int f, soma, resultSoma = 0;

        f = fatorial(n);

        do {
            soma = f % 10;
            f /= 10;
            resultSoma += soma;
        } while (f > 0);

        return resultSoma;
    }

    private static int fatorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++)
            f *= i;

        return f;
    }

}
