import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/**
 * Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres. A
 * formula de conversao eh: A = M * 0.000217, sendo M a area em metros quadrados e A
 * a area em acres.
 */
public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a area em metros quadrados: ");
        double metrosQuadrados = scanner.nextDouble();

        double acres = metrosQuadrados * 0.000217;

        System.out.println("A area de " + metrosQuadrados + " metros quadrados em acres eh: " + acres + " acres.");

        scanner.close();
    }
}
