import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Baseando-se no exercicio 11 adicione os atributos menorMarcha e maiorMarcha,
 * onde o atributo menorMarcha indica qual sera a menor marcha possivel para a
 * moto e o atributo maiorMarcha indica qual sera a maior marcha possivel. Desta
 * forma os metodos marchaAcima e marchaAbaixo devem ser reescritos de forma a nao
 * permitirem a troca de marchas para valores abaixo da menorMarcha e acima da
 * maiorMarcha. O metodo imprimir deve ser modificado de forma a mostrar na tela
 * os valores de todos os atributos.
 */
public class Desafio12 {

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

        System.out.print("Deseja mudar a marcha? [s/n]");
        String mudaMarcha = scanner.nextLine();

        Moto moto = new Moto(marca, modelo, marcha, cor);

        if (mudaMarcha.equalsIgnoreCase("s")) {
            System.out.print("Deseja aumentar uma marcha? [s/n]");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("s"))
                moto.marchaAcima(1);
            else moto.marchaAbaixo(1);

            System.out.println(moto);
        } else System.out.println(moto);

        scanner.close();
    }
}
