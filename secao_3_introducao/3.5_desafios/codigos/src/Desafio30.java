import java.util.Scanner;

/**
 * Leia um valor em real e a cotacao do dolar. Em seguida, imprima o valor correspondente
 * em dolares.
 */
public class Desafio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em real R$ ");
        double real = scanner.nextDouble();

        double dolar = real / 5.41;

        System.out.println("O valor de R$ " + real + " reais em dolar eh: $ " + dolar +" dolares.");

        scanner.close();
    }
}
