import java.util.Scanner;

import static java.lang.Math.log;

/**
 * Ler um numero inteiro. Se o numero lido for negativo, escreva a mensagem "Numero
 * invalido". Se o numero for positivo, calcular o logaritmo deste numero.
 */
public class Desafio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        String logaritmo = (numero <= 0) ? "numero invalido!" : "o logaritmo eh: " + log(numero);

        System.out.println(logaritmo);

        scanner.close();
    }
}
