import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Escreva um algoritmo que leia um numero inteiro entre 100 e 999 e imprima na saida
 * cada um dos algarismos que compoem o numero
 */
public class Desafio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro (entre 100 e 999): ");
        int numero = scanner.nextInt();

        if (numero < 100 || numero > 999) System.out.println("NUMERO INVALIDO!");
        else {
            List<Integer> algarismos = new ArrayList<>();
            algarismos.add(numero / 100);
            algarismos.add((numero % 100) / 10);
            algarismos.add((numero % 100) % 10);

            for (int algarismo: algarismos) System.out.println(algarismo);
        }

        scanner.close();
    }
}
