import java.util.Scanner;

/**
 * Faca um funcao nao-recursiva que receba um numero inteiro positivo N e retorne o
 * superfatorial desse numero. O superfatorial de um numero N eh definida pelo produto dos
 * N primeiros fatoriais de N. Assim, o superfatorial de 4 eh sf(4) = 1! * 2! * 3! * 4! = 288
 */
public class Desafio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("APENAS NUMERO POSITIVO!");
        else System.out.println("sf(" + n + "): " + superfatorial(n));

        scanner.close();
    }

    private static int superfatorial(int n) {
        int sf = 1;
        for (int i = 1; i <= n; i++)
            sf *= fatorial(i);

        return sf;
    }

    private static int fatorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++)
            f *= i;

        return f;
    }

}
