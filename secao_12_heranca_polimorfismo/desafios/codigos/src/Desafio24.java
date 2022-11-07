import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 23 adicione os metodos canalAcima e canalAbaixo,
 * sendo que o metodo canalAcima deve sintonizar sempre o proximo canal em
 * relacao ao canal atual, onde ao chegar ao maior canal possivel devera voltar
 * ao canal 1. O metodo canalAbaixo deve sintonizar sempre o canal anterior em
 * relacao ao canal atual, onde ao chegar ao canal 1 devera voltar ao maior canal
 * possivel, simulando desta forma o funcionamento de um televisor.
 */
public class Desafio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja ligar a televisao? [s/n]");
        String ligado = scanner.nextLine();

        Televisor televisor = new Televisor();
        if (ligado.equalsIgnoreCase("s")) {
            System.out.print("Informe o maior canal da televisao: ");
            int numeroCanais = parseInt(scanner.nextLine());

            System.out.print("Informe o canal da televisao: ");
            int canal = parseInt(scanner.nextLine());

            System.out.print("Informe o volume maximo da televisao: ");
            int volumeMaximo = parseInt(scanner.nextLine());

            System.out.print("Informe o volume da televisao: ");
            int volume = parseInt(scanner.nextLine());

            televisor.setCanal(canal);
            televisor.setVolume(volume);
            televisor.setVolumeMaximo(volumeMaximo);
            televisor.setNumeroCanais(numeroCanais);
            televisor.ligar();

            System.out.print("Deseja aumentar o canal? [s/n]");
            String opcaoAcima =  scanner.nextLine();

            if (opcaoAcima.equalsIgnoreCase("s")) {
                System.out.print("Quantos canais acima deseja ir? ");
                int acima = parseInt(scanner.nextLine());
                televisor.canalAcima(acima);
            } else {
                System.out.print("Deseja abaixar o canal? [s/n]");
                String opcaoAbaixo = scanner.nextLine();

                if (opcaoAbaixo.equalsIgnoreCase("s")) {
                    System.out.print("Quantos canais abaixo deseja ir? ");
                    int abaixo = parseInt(scanner.nextLine());
                    televisor.canalAbaixo(abaixo);
                }
            }

            System.out.println(televisor);
        } else {
            televisor.desligar();
            System.out.println("A televisao esta desligada!");
        }

        scanner.close();
    }
}
