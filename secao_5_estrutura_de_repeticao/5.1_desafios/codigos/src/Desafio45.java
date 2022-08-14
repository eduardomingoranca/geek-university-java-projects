import java.util.Scanner;

/**
 * Faca um algoritmo que converta uma velocidade expressa em km/h para m/s e vice
 * versa. Voce deve criar um menu com as duas opcoes de conversao e com uma opcao
 * para finalizar o programa. O usuario podera fazer quantas conversoes desejar,
 * sendo que o programa so sera finalizado quando a opcao de finalizar for escolhida.
 */
public class Desafio45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("=======================");
            System.out.println("[0] KM/H PARA M/S");
            System.out.println("[1] M/S PARA KM/H");
            System.out.println("[2] SAIR");
            System.out.println("=======================");

            System.out.print("Informe uma opcao: ");
            opcao = scanner.nextInt();

            double velocidade;
            switch (opcao) {
                case 0 -> {
                    System.out.print("Informe a velocidade expressa: ");
                    velocidade = scanner.nextDouble();
                    System.out.println("A VELOCIDADE DE " + velocidade + " KM/H EM METROS POR SEGUNDO EH: "
                            + (velocidade / 3.6) + " M/S");
                }
                case 1 -> {
                    System.out.print("Informe a velocidade expressa: ");
                    velocidade = scanner.nextDouble();
                    System.out.println("A VELOCIDADE DE " + velocidade + " M/S EM QUILOMETROS POR HORA EH: "
                            + (velocidade * 3.6) + " KM/H");
                }
                case 2 -> System.out.println("FIM");
            }

        } while(opcao != 2);

        scanner.close();
    }
}
