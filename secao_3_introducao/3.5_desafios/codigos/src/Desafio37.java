import java.util.Scanner;

/**
 * Faca um programa que leia o valor de um produto e imprima o valor com desconto, tendo
 * em vista que o desconto foi de 12%
 */
public class Desafio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto R$ ");
        double valor = scanner.nextDouble();

        double valorComDesconto = valor - (valor * 0.12);

        System.out.println("O produto com o valor R$ " + valor + " apos o desconto de 12% ficou R$ " + valorComDesconto);

        scanner.close();
    }
}
