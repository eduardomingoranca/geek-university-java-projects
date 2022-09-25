import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Crie uma funcao que recebe como parametro um numero inteiro e devolve o seu dobro.
 */
public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println(" O DOBRO DO NUMERO " + numero + " EH: " + dobro(numero));

        scanner.close();
    }

    private static int dobro(int numero) {
        return (int) pow(numero, 2);
    }

}
