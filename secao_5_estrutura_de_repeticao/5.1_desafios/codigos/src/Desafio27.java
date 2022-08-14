import java.util.Scanner;

/**
 * Em Matematica, o numero harmonico designado por H(n) define-se como sendo a soma
 * da serie harmonica:
 *                      H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 * Faca um programa que leia um valor n inteiro e positivo e apresente o valor de H(n).
 */
public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro positivo: ");
        int n = scanner.nextInt();

        double h = 1;
        if (n <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            for (int i = 1; i <= n; i++) h += (1.0/(i + 1));
            System.out.println("H(n): " + h);
        }

        scanner.close();
    }
}
