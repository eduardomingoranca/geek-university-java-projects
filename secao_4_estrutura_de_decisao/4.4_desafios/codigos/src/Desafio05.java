import java.util.Scanner;

/**
 * Faca um programa que receba um numero inteiro e verifique se este numero eh par ou
 * impar.
 */
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "numero par" : "numero impar";

        System.out.println(resultado);

        scanner.close();
    }
}
