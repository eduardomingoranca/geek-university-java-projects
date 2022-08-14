import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Faca um programa que receba dois numeros. Calcule e mostre:
 *      * a soma dos numeros pares desse intervalo de numeros, incluindo os numeros
 *        digitados.
 *      * a multiplicacao dos numeros impares desse intervalo, incluindo os digitados.
 */
public class Desafio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPar = 0;
        int multiplicacaoImpar = 0;

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe o [" + i + "] numero inteiro: ");
            int numero = scanner.nextInt();

            numeros.add(numero);
        }

        for (int j = numeros.get(0); j <= numeros.get(1); j++) {
            if (j % 2 == 0) somaPar += j;
            else multiplicacaoImpar += j;
        }

        System.out.println("SOMA DOS NUMEROS PARES: " + somaPar +
                " MULTIPLICACAO DOS NUMEROS IMPARES: " + multiplicacaoImpar);

        scanner.close();
    }
}
