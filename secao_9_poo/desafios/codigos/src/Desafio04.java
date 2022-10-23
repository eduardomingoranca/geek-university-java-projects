import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Televisao televisao = new Televisao();

        System.out.print("Informe o volume da televisao: ");
        int volume = Integer.parseInt(scanner.nextLine());
        televisao.setVolume(volume);

        System.out.print("Informe o canal da televisao: ");
        int canal = Integer.parseInt(scanner.nextLine());
        televisao.setCanal(canal);

        ControleRemoto controleRemoto = new ControleRemoto(televisao);

        System.out.print("Deseja aumentar o volume? [s/n]");
        String opcaoVolume = scanner.nextLine();

        if (opcaoVolume.equalsIgnoreCase("s")) {
            System.out.print("Adicione um volume: ");
            volume = Integer.parseInt(scanner.nextLine());
            controleRemoto.controleVolume(volume);
        }

        System.out.print("Deseja diminuir o volume? [s/n]");
        opcaoVolume = scanner.nextLine();

        if (opcaoVolume.equalsIgnoreCase("s")) {
            System.out.print("Diminua um volume: ");
            volume = Integer.parseInt(scanner.nextLine());
            controleRemoto.controleVolume(volume);
        }

        System.out.print("Deseja aumentar o canal? [s/n]");
        String opcaoCanal = scanner.nextLine();

        if (opcaoCanal.equalsIgnoreCase("s")) {
            System.out.print("Adicione um canal: ");
            canal = Integer.parseInt(scanner.nextLine());
            controleRemoto.controleCanal(canal);
        }

        System.out.print("Deseja diminuir o canal? [s/n]");
        opcaoCanal = scanner.nextLine();

        if (opcaoCanal.equalsIgnoreCase("s")) {
            System.out.print("Diminua um canal: ");
            canal = Integer.parseInt(scanner.nextLine());
            controleRemoto.controleCanal(canal);
        }

        System.out.println(controleRemoto.imprimirTelevisao());

        scanner.close();
    }
}
