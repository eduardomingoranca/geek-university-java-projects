import java.util.Scanner;

/**
 * Baseando-se no exercicio 27 adicione os metodos ligar e desligar que deverao
 * mudar o conteudo do atributo ligado conforme o caso.
 */
public class Desafio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o microondas seja ligado? [s/n]");
        String ligado = scanner.nextLine();

        Microondas microondas = new Microondas(ligado.equalsIgnoreCase("s"));

        if (microondas.getLigado()) {
            microondas.ligar();
            System.out.println("O microondas esta ligado!");
        } else {
            microondas.desligar();
            System.out.println("O microondas esta desligado!");
        }

        scanner.close();
    }
}
