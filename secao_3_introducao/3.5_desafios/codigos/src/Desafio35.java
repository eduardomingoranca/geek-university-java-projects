import java.util.Scanner;

/**
 * Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equacao:
 * hipotenusa = \/a2 + b2. Faca um programa que receba os valores de a e b e calcule
 * o valor da hipotenusa atraves da equacao. Imprima o resultado dessa operacao.
 */
public class Desafio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o cateto (a) do triangulo: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o cateto (b) do triangulo: ");
        double b = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("O valor da hipotenusa dos catetos (a): " + a + " (b): " + b + " eh: " + hipotenusa);

        scanner.close();
    }
}
