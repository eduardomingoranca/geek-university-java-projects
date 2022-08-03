import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles,
 * assim como a diferenca existente entre ambos.
 */
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe o [" + i + "] numero: ");
            int numero = scanner.nextInt();

            numeros.add(numero);
        }

        System.out.println("maior: " + Math.max(numeros.get(0) , numeros.get(1)));
        System.out.println("diferenca: " + (numeros.get(0) - numeros.get(1)));

        scanner.close();
    }
}
