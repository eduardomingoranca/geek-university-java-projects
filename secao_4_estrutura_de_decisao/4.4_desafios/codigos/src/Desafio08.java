import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Faca um programa que leia 2 notas de um aluno, verifique se as notas sao validas e
 * exiba na tela a media destas notas. Uma nota valida deve ser, obrigatoriamente, um
 * valor entre 0.0 e 10.0, onde caso a nota nao possua um valor valido, este fato deve
 * ser informado ao usuario e o programa termina.
 */
public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Informe a [" + i + "] nota: ");
            double numero = scanner.nextDouble();

            if (numero < 0.0 || numero > 10.0) {
                System.out.println();
                System.out.println("nota invalida!");
                System.out.println();
                break;
            }

            notas.add(numero);
        }

        System.out.println("Media entre as notas: " + (notas.get(0) + notas.get(1))/2.0);

        scanner.close();
    }
}
