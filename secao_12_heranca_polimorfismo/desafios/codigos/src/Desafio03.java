import java.util.Scanner;

/**
 * Escreva um codigo em Java que apresente a classe Quadrado, com atributos
 * lado, area e perimetro e, os metodos calcularArea, calcularPerimetro e imprimir.
 * Os metodos calcularArea e calcularPerimetro devem efetuar seus respectivos
 * calculos e colocar os valores nos atributos area e perimetro. O metodo imprimir
 * deve mostrar na tela os valores de todos os atributos. Salienta-se que a area de
 * um quadrado eh obtida pela formula (lado * lado) e o perimetro por (4 * lado).
 */
public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado do triagulo: ");
        double lado = scanner.nextDouble();

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(lado);

        System.out.println("AREA: " + quadrado.calcularArea() +
                "\nPERIMETRO: " + quadrado.calcularPerimetro() + "\n");

        System.out.println(quadrado.imprimirQuadrado());

        scanner.close();
    }
}
