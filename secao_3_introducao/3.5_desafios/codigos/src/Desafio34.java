import java.util.Scanner;

/**
 * Leia o valor do raio de um circulo e calcule e imprima a area do circulo correspondente.
 * A area do circulo eh PI * raio2, considere PI = 3.141592.
 */
public class Desafio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do raio de um circulo: ");
        double raio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo do raio " + raio + " eh: " + areaCirculo);

        scanner.close();
    }
}
