import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 20 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto.
 */
public class Desafio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja ligar a televisao? [s/n]");
        String ligado = scanner.nextLine();

        if (ligado.equalsIgnoreCase("s")) {
            System.out.print("Informe o canal da televisao: ");
            int canal = parseInt(scanner.nextLine());

            System.out.print("Informe o volume da televisao: ");
            int volume = parseInt(scanner.nextLine());

            System.out.println(new Televisor(true, canal, volume));
        } else {
            new Televisor().setLigado(false);
            System.out.println("A televisao esta desligada!");
        }

        scanner.close();
    }
}
