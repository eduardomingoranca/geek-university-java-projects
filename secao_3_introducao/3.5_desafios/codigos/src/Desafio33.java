import java.util.Scanner;

/**
 * Leia o tamanho do lado de um quadrado e imprima como resultado a sua area.
 */
public class Desafio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado de um quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        double area = Math.pow(ladoQuadrado, 2);

        System.out.println("A area do quadrado de lado " + ladoQuadrado + " eh: " + area);

        scanner.close();
    }
}
