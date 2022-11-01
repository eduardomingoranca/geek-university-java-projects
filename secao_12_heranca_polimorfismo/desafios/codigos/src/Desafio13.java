import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 12 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto.
 */
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a marca da moto: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o modelo da moto: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe a cor da moto: ");
        String cor = scanner.nextLine();

        System.out.print("Informe a marcha da moto: ");
        int marcha = parseInt(scanner.nextLine());

        System.out.println(new Moto(marca, modelo, marcha, cor));

        scanner.close();
    }
}
