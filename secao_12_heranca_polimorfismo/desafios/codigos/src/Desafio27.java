import java.util.Scanner;

/**
 * Baseando-se no exercicio 26 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto.
 */
public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o microondas seja ligado? [s/n]");
        String ligado = scanner.nextLine();

        System.out.println(new Microondas(ligado.equalsIgnoreCase("s")));

        scanner.close();
    }
}
