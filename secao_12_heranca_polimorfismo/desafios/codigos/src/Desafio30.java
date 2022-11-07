import java.util.Scanner;

/**
 * Baseando-se no exercicio 29 adicione os metodos fecharPorta e abrirPorta que
 * devera mudar o conteudo do atributo portaFechada conforme o caso.
 */
public class Desafio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o microondas seja ligado? [s/n]");
        String ligado = scanner.nextLine();

        Microondas microondas = new Microondas(ligado.equalsIgnoreCase("s"));

        if (microondas.getLigado()) {
            microondas.ligar();
            System.out.println("O microondas esta ligado!");

            microondas.fecharPorta();
            System.out.println("A porta do microondas esta fechada!");
        } else {
            microondas.desligar();
            System.out.println("O microondas esta desligado!");

            microondas.abrirPorta();
            System.out.println("A porta do microondas esta aberta!");
        }

        scanner.close();
    }
}
