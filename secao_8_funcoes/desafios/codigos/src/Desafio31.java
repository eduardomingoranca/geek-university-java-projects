import java.util.Scanner;

/**
 * Faca um funcao para calcular o numero neperiano usando uma serie. A funcao deve
 * ter como parametro o numero de termos que serao somados (note que, quanto maior o
 * numero, mais proxima a resposta estara do valor e).
 * l = 1/0! + 1/1! + 1/2! + 1/3! + 1/4! + ...
 */
public class Desafio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = scanner.nextInt();

        System.out.println("l: " + neperiano(n));

        scanner.close();
    }

    private static double neperiano(int n) {
        double l = 0;
        for (int i = 0; i <= n; i++)
            l += 1.0/fatorial(i);

        return l;
    }

    private static int fatorial(double a) {
        int f = 1;
        for (int i = 1; i <= a; i++)
            f *= i;

        return f;
    }

}
