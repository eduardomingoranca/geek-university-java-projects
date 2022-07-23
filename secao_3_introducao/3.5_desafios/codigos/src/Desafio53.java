import java.util.Scanner;

/**
 * Faca um programa para ler as dimensoes de um terreno (comprimento c e largura l),
 * bem como o preco do metro de tela p. Imprima o custo para cercar este mesmo terreno
 * com tela.
 */
public class Desafio53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do terreno: ");
        double c = scanner.nextDouble();

        System.out.print("Informe a largura do terreno: ");
        double l = scanner.nextDouble();

        System.out.print("Informe o preco do metro de tela: R$ ");
        double p = scanner.nextDouble();

        double custo = (c * l) * p;

        System.out.println("O custo para cercar este mesmo terreno com tela eh de: R$ " + custo);

        scanner.close();
    }
}
