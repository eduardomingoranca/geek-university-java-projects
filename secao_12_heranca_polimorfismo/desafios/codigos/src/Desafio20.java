import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Escreva um codigo em Java que apresente a classe Televisor, com atributos
 * ligado, canal e volume e, o metodo imprimir. O metodo imprimir deve mostrar
 * na tela os valores de todos os atributos. O atributo ligado sera booleano e
 * devera indicar o estado atual do televisor, se ligado ou desligado. O atributo
 * canal devera indicar o canal atual em que o televisor esta sintonizado. O atributo
 * volume devera indicar o volume atual do televisor.
 */
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja ligar a televisao? [s/n]");
        String ligado = scanner.nextLine();

        Televisor televisor = new Televisor();
        if (ligado.equalsIgnoreCase("s")) {
            televisor.setLigado(true);

            System.out.print("Informe o canal da televisao: ");
            int canal = parseInt(scanner.nextLine());
            televisor.setCanal(canal);

            System.out.print("Informe o volume da televisao: ");
            int volume = parseInt(scanner.nextLine());
            televisor.setVolume(volume);

            System.out.println(televisor);
        } else {
            televisor.setLigado(false);
            System.out.println("A televisao esta desligada!");
        }

        scanner.close();
    }
}
