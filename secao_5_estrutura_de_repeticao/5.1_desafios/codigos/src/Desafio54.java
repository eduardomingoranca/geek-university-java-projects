import java.util.Scanner;

/**
 * Faca um programa que receba um numero inteiro maior do que 1, e verifique se o numero
 * fornecido eh primo ou nao.
 */
public class Desafio54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            boolean primo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            System.out.println((!primo) ? "NAO PRIMO" : "PRIMO");
        }

        scanner.close();
    }
}
