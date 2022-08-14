import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Faca um algoritmo que encontre o primeiro multiplo de 11, 13 ou 17 apos um numero
 * dado
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList();

        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe o [" + i + "] numero inteiro: ");
            int numero = scanner.nextInt();

            numeros.add(numero);
        }

        if (numeros.get(0) <= 0 || numeros.get(1) <= 0) System.out.println("NUMERO INVALIDO!");
        else {
            if (numeros.get(0) > numeros.get(1)) {
                for (int i = numeros.get(1); i <= numeros.get(0); i++) {
                    if (i % 11 == 0 || i % 13 == 0 || i % 17 == 0) {
                        System.out.println("NUMERO: " + i);
                        break;
                    }
                }
            } else {
                for (int i = numeros.get(0); i <= numeros.get(1); i++) {
                    if (i % 11 == 0 || i % 13 == 0 || i % 17 == 0) {
                        System.out.println("NUMERO: " + i);
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}
