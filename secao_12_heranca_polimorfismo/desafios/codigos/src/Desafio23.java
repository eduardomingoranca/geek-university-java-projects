import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 22 adicione os atributos numeroCanais e,
 * volumeMaximo, onde numeroCanais indica o numero maximo de canais
 * que o televisor pode sintonizar e volumeMaximo indica qual o maior
 * nivel de volume possivel. O metodo imprimir deve ser modificado de
 * forma a mostrar na tela os valores de todos os atributos.
 */
public class Desafio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja ligar a televisao? [s/n]");
        String ligado = scanner.nextLine();

        Televisor televisor = new Televisor();
        if (ligado.equalsIgnoreCase("s")) {
            System.out.print("Informe o canal da televisao: ");
            int canal = parseInt(scanner.nextLine());

            System.out.print("Informe o volume da televisao: ");
            int volume = parseInt(scanner.nextLine());

            System.out.print("Informe o volume maximo da televisao: ");
            int volumeMaximo = parseInt(scanner.nextLine());

            System.out.print("Informe o numero de canais da televisao: ");
            int numeroCanais = parseInt(scanner.nextLine());

            televisor.setCanal(canal);
            televisor.setVolume(volume);
            televisor.setVolumeMaximo(volumeMaximo);
            televisor.setNumeroCanais(numeroCanais);
            televisor.ligar(true);

            System.out.println(televisor);
        } else {
            televisor.desligar(false);
            System.out.println("A televisao esta desligada!");
        }

        scanner.close();
    }
}
