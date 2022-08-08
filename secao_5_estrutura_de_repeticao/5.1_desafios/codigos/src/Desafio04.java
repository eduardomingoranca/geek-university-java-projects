/**
 * Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000
 * em 1000, imprimindo seu valor na tela, ate que seu valor seja 100000 (cem mil).
 */
public class Desafio04 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100_000; i+= 1000) System.out.print(i + " ");

    }
}
