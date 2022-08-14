import java.util.Scanner;

/**
 * Faca um programa que calcule a area de um triangulo, cuja base e altura sao fornecidas
 * pelo usuario. Esse programa nao pode permitir a entrada de dados invalidos, ou seja,
 * medidas menores ou iguais a 0.
 */
public class Desafio39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do triangulo: ");
        double b = scanner.nextDouble();

        System.out.print("Informe a altura do triangulo: ");
        double h = scanner.nextDouble();

        if (b <= 0 || h <= 0) System.out.println("NUMEROS INVALIDOS!");
        else System.out.println("AREA DO TRIANGULO: " +  (b * h) / 2.0);

        scanner.close();
    }
}
