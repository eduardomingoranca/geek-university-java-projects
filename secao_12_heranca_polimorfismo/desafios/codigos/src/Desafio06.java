import java.util.Scanner;

/**
 * Baseando-se no exercicio 05 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto
 */
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do retangulo: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Informe a largura do retangulo: ");
        double largura = scanner.nextDouble();

        System.out.println(new Retangulo(comprimento, largura));

        scanner.close();

    }
}
