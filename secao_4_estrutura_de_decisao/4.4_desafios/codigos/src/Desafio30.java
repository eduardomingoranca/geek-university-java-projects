import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Faca um programa que receba tres numeros e mostre-os em ordem crescente.
 */
public class Desafio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> ordem = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe o [" + i + "] numero: ");
            double numero = scanner.nextDouble();

            ordem.add(numero);
        }

        if (ordem.get(0) > ordem.get(1) && ordem.get(1) > ordem.get(2))
            System.out.println("ORDEM CRESCENTE: " + ordem.get(0) + " " + ordem.get(1) + " " + ordem.get(2));
        else if (ordem.get(0) > ordem.get(2) && ordem.get(2) > ordem.get(1))
            System.out.println("ORDEM CRESCENTE: " + ordem.get(0) + " " + ordem.get(2) + " " + ordem.get(1));
        else if (ordem.get(1) > ordem.get(0) && ordem.get(0) > ordem.get(2))
            System.out.println("ORDEM CRESCENTE: " + ordem.get(1) + " " + ordem.get(0) + " " + ordem.get(2));
        else if (ordem.get(1) > ordem.get(2) && ordem.get(2) > ordem.get(0))
            System.out.println("ORDEM CRESCENTE: " + ordem.get(1) + " " + ordem.get(2) + " " + ordem.get(0));
        else if (ordem.get(2) > ordem.get(1) && ordem.get(1) > ordem.get(0))
            System.out.println("ORDEM CRESCENTE: " + ordem.get(2) + " " + ordem.get(1) + " " + ordem.get(0));
        else if (ordem.get(2) > ordem.get(0) && ordem.get(0) > ordem.get(1))
            System.out.println("ORDEM CRESCENTE: " + ordem.get(2) + " " + ordem.get(0) + " " + ordem.get(1));

        scanner.close();
    }
}
