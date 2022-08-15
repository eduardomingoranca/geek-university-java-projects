import java.util.Scanner;

/**
 * Faca um programa que apresente um menu de opcoes para o calculo das seguintes
 * operacoes entre dois numeros:
 *      * adicao (opcao 1)
 *      * subtracao (opcao 2)
 *      * multiplicacao (opcao 3)
 *      * divisao (opcao 4)
 *      * saida (opcao 5)
 * O programa deve possibilitar ao usuario a escolha da operacao desejada, a exibicao do
 * resultado e a volta ao menu de opcoes. O programa so termina quando for escolhida a
 * opcao de saida (opcao 5).
 */
public class Desafio47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("===================================");
            System.out.println(" [1] ADICAO        | [2] SUBTRACAO ");
            System.out.println(" [3] MULTIPLICACAO | [4] DIVISAO   ");
            System.out.println("             [5] SAIDA             ");
            System.out.println("===================================");

            System.out.print("Informe uma opcao: ");
            opcao = scanner.nextInt();

            double v1;
            double v2;

            switch (opcao) {
                case 1 -> {
                    System.out.print("v1: ");
                    v1 = scanner.nextDouble();
                    System.out.print("v2: ");
                    v2 = scanner.nextDouble();
                    System.out.println("ADICAO: " + (v1 + v2));
                }
                case 2 -> {
                    System.out.print("a1: ");
                    v1 = scanner.nextDouble();
                    System.out.print("a2: ");
                    v2 = scanner.nextDouble();
                    System.out.println("SUBTRACAO: " + (v1 - v2));
                }
                case 3 -> {
                    System.out.print("b1: ");
                    v1 = scanner.nextDouble();
                    System.out.print("b2: ");
                    v2 = scanner.nextDouble();
                    System.out.println("MULTIPLICACAO: " + (v1 * v2));
                }
                case 4 -> {
                    System.out.print("c1: ");
                    v1 = scanner.nextDouble();
                    System.out.print("c2: ");
                    v2 = scanner.nextDouble();
                    System.out.println("DIVISAO: " + (v1 / v2));
                }
                case 5 -> System.out.println("FIM");
                default -> System.out.println("NUMERO INVALIDO!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
