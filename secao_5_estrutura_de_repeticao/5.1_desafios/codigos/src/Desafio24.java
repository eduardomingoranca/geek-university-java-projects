import java.util.Scanner;

/**
 * Escreva um programa que leia um numero inteiro e calcule a soma de todos os divisores
 * desse numero, com excecao dele proprio. Ex: a soma dos divisores do numero 66 eh
 * 1 + 2 + 3 + 6 + 11 + 22 + 33 = 78
 */
public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe um numero inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;
        if (numero <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            for (int i = 1; i < numero; i++) if (numero % i == 0) soma += i;
            System.out.println("SOMA: " + soma);
        }



        scanner.close();
    }
}
