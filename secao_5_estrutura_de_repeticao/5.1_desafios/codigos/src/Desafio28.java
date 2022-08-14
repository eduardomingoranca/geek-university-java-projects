import java.util.Scanner;

/**
 * Faca um programa que leia um valor N inteiro e positivo, calcule o mostre o valor E,
 * conforme a formula a seguir
 *                              E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
 */
public class Desafio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro positivo: ");
        int n = scanner.nextInt();

        if (n <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            double e = 1;
            int soma = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j >= 1; j--) {
                     e += 1.0/(soma += j);
                    break;
                }
            }
            System.out.println("E = " + e);
        }

        scanner.close();
    }
}
