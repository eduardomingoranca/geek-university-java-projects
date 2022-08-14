import java.util.Scanner;

/**
 * Faca um programa que simula o lancamento de dois dados, d1 e d2, n vezes, e tem como
 * saida o numero de cada dado e a relacao entre eles (>,<,=) de cada lancamento.
 */
public class Desafio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de vezes de lancamento do dado: ");
        int n = scanner.nextInt();

        int maiorD1 = 0;
        int maiorD2 = 0;
        int iguais = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("D1: ");
            double d1 = scanner.nextDouble();

            System.out.print("D2: ");
            double d2 = scanner.nextDouble();

            if (d1 > d2) maiorD1++;
            else if (d2 > d1) maiorD2++;
            if (d2 == d1) iguais++;
        }

        System.out.println("D1 foi maior: " + maiorD1 + " vezes");
        System.out.println("D2 foi maior: " + maiorD2 + " vezes");
        System.out.println("D1 e D2 foram iguais: " + iguais + " vezes");

        scanner.close();
    }
}
