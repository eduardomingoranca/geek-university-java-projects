import java.util.Scanner;

/**
 * Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume
 * de um cilindro circular eh calculado por meio da seguinte formula: V = PI * raio2 * altura,
 * onde PI = 3.141592.
 */
public class Desafio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura de um cilindro circular: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe a raio de um cilindro circular: ");
        double raio = scanner.nextDouble();

        double v = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume de um cilindro circular de altura " + altura + " com o raio " + raio +
                " eh: " + v);

        scanner.close();
    }
}
