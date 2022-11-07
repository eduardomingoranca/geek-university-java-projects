import java.util.Scanner;

/**
 * Baseando-se no exercicio 18 adicione os metodos ligar e desligar que deverao
 * mudar o conteudo do atributo ligado conforme o caso.
 */
public class Desafio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja que o eletrodomestico esteja ligado? [s/n]");
        String ligado = scanner.nextLine();

        Eletrodomestico eletrodomestico = new Eletrodomestico();
        if (ligado.equalsIgnoreCase("s")) {
            System.out.println("O eletrodomestico esta ligado!");
            eletrodomestico.ligar();
            System.out.println(eletrodomestico);
        } else {
            System.out.println("O eletrodomestico esta desligado!");
            eletrodomestico.desligar();
            System.out.println(eletrodomestico);
        }

        scanner.close();
    }
}
