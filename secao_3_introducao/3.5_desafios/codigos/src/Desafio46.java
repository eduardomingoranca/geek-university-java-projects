import java.util.Scanner;

/**
 * Faca um programa que leia um numero inteiro positivo de tres digitos (de 100 a 999).
 * Gere outro numero formado pelos digitos invertidos do numero lido. Exemplo:
 *                              NumeroLido = 123
 *                              NumeroGerado = 321
 */
public class Desafio46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro positivo de tres digitos (de 100 a 999): ");
        int numero = scanner.nextInt();

        int numero1 = (numero % 10);
        int numero2 = (numero % 100) / 10;
        int numero3 = (numero / 100);

        System.out.println(numero1 + "" + numero2 + "" + numero3);

        scanner.close();
    }
}
