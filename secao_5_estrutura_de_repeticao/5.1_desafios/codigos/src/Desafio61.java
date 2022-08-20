import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Faca um programa que calcule o maior numero palindromo feito a partir do produto de
 * dois numeros de 3 digitos. Ex: O maior palindromo feito a partir do produto de dois
 * numeros de dois digitos eh 9009 = 91 * 93;
 */
public class Desafio61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i; // 1º Numero de tres digitos
        int j; // 2º Numero de tres digitos
        int produto; // Produto entre o 1º e 2º numeros
        int numeroInverso;
        int temporaria; // Temporaria utilizada para contagem de digitos do produto e para inverter o produto
        int quantidadeDigito = 0; // Quantidade de digitos do produto
        int cifra; // Um algarismo do produto (Utilizada para inverter o produto)
        int maiorPalindromo = 0; // O maior palindromo formado pelo produto
        int fatorMaior1 = 0;
        int fatorMaior2 = 0; // Sao os fatores que resultam no maior numero palindromo

        for (i = 999; i >= 100; i--) {
            for (j = i; j >= 100; j--) {
                produto = i * j;

                if (produto > maiorPalindromo) {
                    // Contagem de digitos do produto
                    temporaria = produto;
                    while (temporaria != 0) {
                        quantidadeDigito++;
                        temporaria /= 10;
                    }

                    // Inversao do produto
                    temporaria = produto;
                    numeroInverso = 0;
                    while(temporaria != 0) {
                        cifra = temporaria % 10;
                        numeroInverso += cifra * pow(10, quantidadeDigito - 1);
                        temporaria /= 10;
                        quantidadeDigito--;
                    }

                 // Comparacao se eh um numero palindromo
                    if (produto == numeroInverso) {
                        maiorPalindromo = numeroInverso;
                        fatorMaior1 = i;
                        fatorMaior2 = j;
                    }

                }
            }
        }

       System.out.printf("O maior palindromo eh formado pela multiplicacao de %d x %d = %d\n\n", fatorMaior1,
               fatorMaior2, maiorPalindromo);

        scanner.close();
    }

}
