import java.util.Scanner;

/**
 * Faca um programa que leia um vetor de 8 posicoes e, em seguida, leia tambem dois valores
 * X e Y quaisquer correspondentes a duas posicoes no vetor. Ao final seu programa devera
 * escrever a soma dos valores encontrados nas respectivas posicoes X e Y.
 */
public class Desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[8];
        int x, y;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i+1) + "] numero: ");
            vet[i] = scanner.nextDouble();
        }

        System.out.print("X: ");
        x = scanner.nextInt();

        System.out.print("Y: ");
        y = scanner.nextInt();

        if (x < 0 || x > 8 || y < 0 || y > 8) System.out.println("POSICAO INVALIDA!");
        else System.out.println("SOMA: " +(vet[x] + vet[y]));

        scanner.close();
    }
}
