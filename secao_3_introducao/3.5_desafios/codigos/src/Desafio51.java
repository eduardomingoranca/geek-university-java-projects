import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.toRadians;

/**
 * Escreva um programa que leia as coordenadas x e y de pontos no R2 e calcule sua
 * distancia da origem (0,0).
 */
public class Desafio51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a coordenada X: ");
        double x = scanner.nextDouble();

        System.out.print("Informe a coordenada Y: ");
        double y = scanner.nextDouble();

        double distancia = toRadians(pow(x, 2) + pow(y, 2));

        System.out.println("A distancia entre a origem (0,0) e o ponto de coordenadas ({"
                + x + "}, {" + y + "}) eh: {" + distancia + "}");

        scanner.close();
    }
}
