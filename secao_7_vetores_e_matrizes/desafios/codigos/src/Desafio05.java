import java.util.Scanner;

/**
 * Leia um vetor de 10 posicoes. Contar e escrever quantos valores pares ele possui.
 */
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextDouble();
        }

        int par = 0;
        for (double num: vet) {
            if (num % 2 == 0) par++;
        }

        System.out.println("TOTAL DE NUMEROS PARES: " + par);

        scanner.close();
    }
}
