import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 15 adicione os metodos ligar e desligar que deverao
 * mudar o conteudo do atributo ligada conforme o caso.
 */
public class Desafio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a marca da moto: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o modelo da moto: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe a cor da moto: ");
        String cor = scanner.nextLine();

        System.out.print("Informe a marcha da moto: ");
        int marcha = parseInt(scanner.nextLine());

        System.out.print("Deseja ligar a moto? [s/n]");
        String ligada = scanner.nextLine();

        Moto moto = new Moto(marca, modelo, marcha, cor);

        if (ligada.equalsIgnoreCase("s")) {
            System.out.println("A moto esta ligada!");
            moto.ligar(true);
            System.out.println(moto);
        } else {
            System.out.println("A moto esta desligada!");
            moto.desligar(false);
            System.out.println(moto);
        }

        scanner.close();
    }
}
