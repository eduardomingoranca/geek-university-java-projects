import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Leia um angulo em radianos e apresente-o convertido em graus. A formula de conversao
 * eh: G = R * 180/PI, sendo G o angulo em graus e R em radianos e PI = 3.14
 */
public class Desafio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o angulo em radianos: ");
        double radianos = scanner.nextDouble();

        double graus = radianos * 180/PI;

        System.out.println("O angulo de " + radianos + " radianos em graus eh: " + graus + " graus. ");

        scanner.close();
    }

}
