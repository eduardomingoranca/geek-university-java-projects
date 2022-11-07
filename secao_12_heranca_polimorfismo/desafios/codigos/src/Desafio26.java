import java.util.Scanner;

/**
 * Escreva um codigo em Java que apresente a classe Microondas, com atributo
 * ligado e o metodo imprimir. O metodo imprimir deve mostrar na tela os valores
 * de todos os atributos. O atributo ligado sera booleano e devera indicar o estado
 * atual do microondas, se ligado ou desligado.
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o microondas seja ligado? [s/n]");
        String ligado = scanner.nextLine();

        Microondas microondas = new Microondas();
        microondas.setLigado(ligado.equalsIgnoreCase("s"));

        System.out.println(microondas);

        scanner.close();
    }
}
