import java.util.Scanner;

/**
 * Faca um algoritmo que receba um numero inteiro positivo n e calcule o seu fatorial, n!.
 */
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();

        if (numero < 0) System.out.println("NUMERO INVALIDO!");
        else System.out.println(numero + "!: " +  fatorial(numero));


        scanner.close();
    }

    private static int fatorial(int numero) {
        int multiplicacao = 1;

        for (int i = 1; i <= numero; i++)
            multiplicacao *= i;

        return multiplicacao;
    }

}
