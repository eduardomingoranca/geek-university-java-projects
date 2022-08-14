import java.util.Scanner;

/**
  Faca um programa que calcule o menor divisivel por cada um dos numeros de 1
  a 20? Ex: 2520 eh o menor numero que pode ser dividido por cada um dos numeros de 1
  a 10, sem sobrar resto.
 */
public class Desafio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int divisores;
        int valor = 18;

        do {
            divisores = 0;
            valor += 2;
            for (int i = 1; i <= 20; i++) if (valor % i == 0) divisores++;
        } while (divisores != 20);

        System.out.println("VALOR: " + valor);

        scanner.close();
    }
}
