import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 24 adicione os metodos volumeAcima e
 * volumeAbaixo, sendo que o metodo volumeAcima deve modificar o volume
 * para o proximo nivel de volume possivel, onde ao chegar ao volumeMaximo nao
 * podera possibilitar que o volume seja alterado. O metodo volumeAbaixo em relacao
 * ao volume atual, nao podendo ser menor do que 0, simulando desta forma o
 * funcionamento de um televisor.
 */
public class Desafio25 {

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
            televisor.ligar(true);

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

            System.out.print("Deseja aumentar o volume? [s/n]");
            String aumentarVolume = scanner.nextLine();

            if (aumentarVolume.equalsIgnoreCase("s")) {
                System.out.print("Quanto deseja aumentar? ");
                int aumentar = parseInt(scanner.nextLine());
                televisor.volumeAcima(aumentar);
            } else {
                System.out.print("Deseja abaixar o volume? [s/n]");
                String abaixarVolume = scanner.nextLine();

                if (abaixarVolume.equalsIgnoreCase("s")) {
                    System.out.print("Quanto deseja abaixar? ");
                    int abaixar = parseInt(scanner.nextLine());
                    televisor.volumeAbaixo(abaixar);
                }
            }

            System.out.println(televisor);
        } else {
            televisor.desligar(false);
            System.out.println("A televisao esta desligada!");
        }

        scanner.close();
    }
}
