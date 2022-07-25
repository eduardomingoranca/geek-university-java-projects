import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Faca um programa que receba dois numeros e mostre o maior. Se por acaso, os dois
 * numeros forem iguais, imprima a mensagem numeros iguais.
 */
public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe o [" + i + "] numero: ");
            int numero = scanner.nextInt();

            numeros.add(numero);
        }

        boolean igual = numeros.get(0).equals(numeros.get(1));

        if (igual) {
            System.out.println("numeros iguais");
        } else {
            int maior = Math.max(numeros.get(0) , numeros.get(1));
            System.out.println("maior: " + maior);
        }

        scanner.close();
    }
}
