import java.util.Scanner;

import static java.lang.String.valueOf;

/**
 * Faca um programa que leia um numero "n" informado pelo usuario e diga quantos
 * numeros primos ha entre 0 e "n". Esse seu programa deve rodar em 2 threads, de
 * forma que o esforco computacional seja uniformemente dividido entre as threads.
 */
public class Desafio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            if (ehPrimo(i)) soma +=i;
        }

        System.out.println("TOTAL: " + soma);

        Thread thread = new Thread(valueOf(soma));
        thread.start();

        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero == 1) return false;

        for (int j = 2; j <= numero/2; j++) {
            if (numero % j == 0) return false;
        }

        return true;
    }

}
