import java.util.Scanner;

/**
 * Baseando-se no exercicio 30 modifique o metodo ligar para que so ligue o
 * equipamento quando a porta do mesmo estiver fechada, simulando assim o
 * funcionamento de um microondas.
 */
public class Desafio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A porta do microondas esta aberta? [s/n]");
        String opcao = scanner.nextLine();

        Microondas microondas = new Microondas();
        if (opcao.equalsIgnoreCase("s")) {
            microondas.abrirPorta();
            System.out.println("A porta esta aberta!");
            microondas.desligar();
            System.out.println("O microondas esta desligado!");
        } else if (opcao.equalsIgnoreCase("n")) {
            microondas.fecharPorta();
            System.out.println("A porta esta fechada!");
            microondas.ligar();
            System.out.println("O microondas esta ligado!");
        }

        scanner.close();
    }
}
