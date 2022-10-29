import java.util.Scanner;

/**
 * Baseando-se no exercicio 07 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto.
 */
public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do circulo: ");
        double raio = scanner.nextDouble();

        System.out.println(new Circulo(raio));

        scanner.close();
    }
}
