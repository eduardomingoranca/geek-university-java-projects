import java.util.Scanner;

import static java.lang.Double.MIN_VALUE;

/**
 * Escreva um algoritmo que leia certa quantidade de numeros e imprima o maior deles e
 * quantas vezes o maior numero foi lido. A quantidade de numeros a serem lidos deve ser
 * fornecida pelo usuario.
 */
public class Desafio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de numeros: ");
        int numeros = scanner.nextInt();

        if (numeros <= 0)
            System.out.println("NUMERO INVALIDO!");
        else {
            double maior = MIN_VALUE;
            int quantidade = 1;
            for (int i = 1; i <= numeros; i++) {
                System.out.print("Informe o [" + i + "] numero: ");
                double numero = scanner.nextDouble();

                if(numero > maior){
                    quantidade++;
                    maior = numero;
                }
            }

            System.out.println("MAIOR NUMERO: " + maior + " QUANTIDADE VEZES NUMERO MAIOR: " + quantidade);
        }

        scanner.close();
    }
}
