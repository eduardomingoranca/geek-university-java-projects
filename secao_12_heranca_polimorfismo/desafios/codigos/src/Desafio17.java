import java.util.Scanner;

/**
 * Escreva um codigo em Java que apresente a classe Eletrodomestico, com
 * atributo ligado e o metodo imprimir. O metodo imprimir deve mostrar na
 * tela os valores de todos os atributos. O atributo ligado sera booleano
 * e devera indicar o estado atual do eletrodomestico, se ligado ou desligado.
 */
public class Desafio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o eletrodomestico esteja ligado? [s/n]");
        String ligado = scanner.nextLine();

        Eletrodomestico eletrodomestico = new Eletrodomestico();
        if (ligado.equalsIgnoreCase("s")) {
            System.out.println("O eletrodomestico esta ligado!");
            eletrodomestico.setLigado(true);
            System.out.println(eletrodomestico);
        } else {
            System.out.println("O eletrodomestico esta desligado!");
            eletrodomestico.setLigado(false);
            System.out.println(eletrodomestico);
        }

        scanner.close();
    }
}
