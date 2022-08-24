import java.util.Scanner;

/**
 * Leia 10 numeros inteiros e armazene em um vetor. Em seguida escreva os elementos
 * que sao primos e suas respectivas posicoes no vetor.
 */
public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextInt();
        }

        for (int j = 0; j < vet.length; j++) {
            if (numeroPrimo(vet[j])) System.out.print(" " + vet[j] + " (" + j + ")");
        }

        scanner.close();
    }

    private static boolean numeroPrimo(int i) {
        if (i == 1) return false;

        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) return false;
        }

        return true;
    }
}
