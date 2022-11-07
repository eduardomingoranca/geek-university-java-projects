import java.util.Scanner;

/**
 * Baseando-se no exercicio 28 adicione o atributo portaFechada que devera ser
 * booleano e devera indicar se a porta do microondas esta ou nao fechada. O
 * metodo imprimir deve ser modificado de forma a mostrar na tela os valores de
 * todos os atributos.
 */
public class Desafio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o microondas seja ligado? [s/n]");
        String ligado = scanner.nextLine();

        Microondas microondas = new Microondas(ligado.equalsIgnoreCase("s"));

        if (microondas.getLigado()) {
            microondas.ligar();
            System.out.println("O microondas esta ligado!");

            microondas.setPortaFechada(false);
            System.out.println("A porta do microondas esta fechada!");
        } else {
            microondas.desligar();
            System.out.println("O microondas esta desligado!");

            microondas.setPortaFechada(true);
            System.out.println("A porta do microondas esta aberta!");
        }

        scanner.close();
    }
}
