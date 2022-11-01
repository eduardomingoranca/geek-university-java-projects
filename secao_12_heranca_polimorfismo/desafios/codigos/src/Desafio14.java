import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 13 adicione o atributo ligada que tera a funcao de
 * indicar se a moto esta ligada ou nao. Este atributo devera ser do tipo booleano.
 * O metodo imprimir deve ser modificado de forma a mostrar na tela os valores de
 * todos os atributos.
 */
public class Desafio14 {

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

        System.out.print("A moto esta ligada? [s/n]");
        String ligada = scanner.nextLine();

        Moto moto = new Moto();
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setCor(cor);
        moto.setMarcha(marcha);
        moto.setLigada(ligada.equalsIgnoreCase("s"));

        System.out.println(moto);

        scanner.close();
    }
}
