import java.util.Scanner;

/**
 * Baseando-se no exercicio 17 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto.
 */
public class Desafio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o eletrodomestico esteja ligado? [s/n]");
        String ligado = scanner.nextLine();

        if (ligado.equalsIgnoreCase("s")) {
            System.out.println("O eletrodomestico esta ligado!");
            System.out.println(new Eletrodomestico(true));
        } else {
            System.out.println("O eletrodomestico esta desligado!");
            System.out.println(new Eletrodomestico(false));
        }

        scanner.close();
    }
}
