import java.util.Scanner;

/**
 * Baseando-se no exercicio 3 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto.
 */
public class Desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado do triagulo: ");
        double lado = scanner.nextDouble();

        System.out.println(new Quadrado(lado).imprimirQuadrado());

        scanner.close();

    }
}
