import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 21 adicione os metodos ligar e desligar que deverao
 * mudar o conteudo do atributo ligado conforme o caso.
 */
public class Desafio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja ligar a televisao? [s/n]");
        String ligado = scanner.nextLine();

        if (ligado.equalsIgnoreCase("s")) {
            System.out.print("Informe o canal da televisao: ");
            int canal = parseInt(scanner.nextLine());

            System.out.print("Informe o volume da televisao: ");
            int volume = parseInt(scanner.nextLine());

            Televisor televisor = new Televisor(true, canal, volume);
            televisor.ligar();

            System.out.println(televisor);
        } else {
            Televisor televisor = new Televisor();
            televisor.desligar();
            System.out.println("A televisao esta desligada!");
        }

        scanner.close();
    }
}
