import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Escreva um codigo em Java que apresente a classe Moto, com atributos marca,
 * modelo, cor e marcha e, o metodo imprimir. O metodo imprimir deve mostrar na
 * tela os valores de todos os atributos. O atributo marcha indica em que a marcha
 * a Moto se encontra no momento, sendo representado de forma inteira, onde 0 -
 * neutro, 1 - primeira, 2 - segunda, etc.
 */
public class Desafio09 {

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

        Moto moto = new Moto();
        moto.setMarca(marca);
        moto.setModelo(modelo);
        moto.setMarcha(marcha);
        moto.setCor(cor);

        System.out.println(moto);

        scanner.close();
    }
}
