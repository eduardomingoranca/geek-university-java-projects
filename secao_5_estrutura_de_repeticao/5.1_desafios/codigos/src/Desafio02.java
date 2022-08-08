/**
 * Escreva um programa que escreva na tela, de 1 ate 100, de 1 em 1, 3 vezes. A primeira
 * vez deve usar a estrutura de repeticao for, a segunda while, e a terceira do while.
 */
public class Desafio02 {

    public static void main(String[] args) {

        System.out.println("================================");

        for (int i = 1; i <= 100; i++) System.out.print(i + " ");

        System.out.println();
        System.out.println("================================");

        int i = 1;
        while(i <= 100) System.out.print(i++ + " ");

        System.out.println();
        System.out.println("================================");

        int a = 1;
        do System.out.print(a + " "); while(a++ < 100);

        System.out.println();
        System.out.println("================================");

    }
}
