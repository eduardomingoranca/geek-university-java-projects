import java.util.Scanner;

/**
 * Faca um programa que some os termos de valor par da sequencia de Fibonacci, cujos
 * valores nao ultapassem quatro milhoes.
 */
public class Desafio48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int proximo  = 1;
        int anterior = 0;

        int soma = 0;
        for (int i = 1; i <= 4_000_000; i++) {
            if (anterior % 2 == 0) soma += anterior;
            int fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }

        System.out.println("SOMA: " + soma);

        scanner.close();
    }
}
