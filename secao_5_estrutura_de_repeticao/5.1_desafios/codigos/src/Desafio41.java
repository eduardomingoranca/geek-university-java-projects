import java.util.Scanner;

/**
 * Faca um programa que calcula a associacao em paralelo de dois resistores R1 e R2
 * fornecidos pelo usuario via teclado. O programa fica pedindo estes valores e calculando
 * ate que o usuario entre com um valor para resistencia igual a zero.
 *          R = R1 * R2
 *              R1 + R2
 */
public class Desafio41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r1, r2;
        double r = 0;
        do {
            System.out.print("R1: ");
            r1 = scanner.nextDouble();

            System.out.print("R2: ");
            r2 = scanner.nextDouble();

            if (r1 != 0 && r2 != 0) r = ((r1 * r2) / (r1 + r2));
        } while(r1 != 0 || r2 != 0);

        System.out.println("R: " + r);

        scanner.close();
    }
}
