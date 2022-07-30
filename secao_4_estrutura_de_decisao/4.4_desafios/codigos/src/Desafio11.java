import java.util.Scanner;

/**
 * Escreva um programa que leia um numero inteiro maior do que zero e devolva, na tela, a
 * soma de todos os seus algarismos. Por exemplo, ao numero 251 correspondera o valor
 * 8 (2 + 5 + 1). Se o numero lido nao for maior do que zero, o programa terminara com a
 * mensagem "Numero invalido"
 */
public class Desafio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero (com 3 digitos): ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int algarismo = 0;
            algarismo += (numero / 100) + (numero % 100) % 10 + (numero % 100) / 10;

            System.out.println(algarismo);
        } else
            System.out.println("numero invalido!");

        scanner.close();
    }
}
