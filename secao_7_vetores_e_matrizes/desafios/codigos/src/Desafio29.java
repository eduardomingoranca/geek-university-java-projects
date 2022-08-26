import java.util.Scanner;

/**
 * Faca um programa que receba 6 numeros inteiros e mostre:
 *      * Os numeros pares digitados;
 *      * A soma dos numeros pares digitados;
 *      * Os numeros impares digitados;
 *      * A quantidade de numeros impares digitados;
 */
public class Desafio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[6];
        int soma = 0;
        int quantidade = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            vet[i] = scanner.nextInt();
        }

        for (int j : vet) {
            if (j % 2 == 0) {
                System.out.print(" " + j);
                soma += j;
            }
        }

        System.out.println();
        for (int k: vet) {
            if (k % 2 != 0) {
                System.out.print(" " + k);
                quantidade++;
            }

        }
        System.out.println();
        System.out.println("SOMA PAR: " + soma + " \nTOTAL NUMEROS IMPARES: " + quantidade);

        scanner.close();
    }

}
