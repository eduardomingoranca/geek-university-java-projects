import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Leia um angulo em graus e apresente-o convertido em radianos. A formula de conversao
 * eh: R = G * pi/180, sendo G o angulo em graus e R em radianos e pi = 3.14
 */
public class Desafio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o angulo em graus: ");
        double graus = scanner.nextDouble();

        double radianos = graus * PI/180;

        System.out.println("O angulo de " + graus + " graus em radianos eh: " + radianos + " radianos.");

        scanner.close();
    }

}
