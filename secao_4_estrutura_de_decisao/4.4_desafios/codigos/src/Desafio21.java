import java.util.Scanner;

/**
 * Escreva o menu de opcoes abaixo. Leia a opcao do usuario e execute a operacao escolhida.
 * Escreva uma mensagem de erro se a opcao for invalida.
 *
 * Escolha a opcao:
 * 1 - Soma de 2 numeros.
 * 2 - Diferenca entre 2 numeros (maior pelo menor).
 * 3 - Produto entre 2 numeros.
 * 4 - Divisao entre 2 numeros (o denominador nao pode ser zero).
 * Opcao.
 */
public class Desafio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================================================");
        System.out.println(" [1] > SOMA DE 2 NUMEROS ");
        System.out.println(" [2] > DIFERENCA ENTRE 2 NUMEROS (MAIOR PELO MENOR) ");
        System.out.println(" [3] > PRODUTO ENTRE 2 NUMEROS ");
        System.out.println(" [4] > DIVISAO ENTRE 2 NUMEROS (O DENOMINADOR NAO PODE SER ZERO) ");
        System.out.println("===================================================================");

        System.out.print("Informe uma opcao: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                double soma = 0.0;
                for (int i = 1; i <= 2; i++) {
                    System.out.print("Informe o [" + i + "] numero: ");
                    double numero = scanner.nextDouble();

                    soma += numero;
                }
                System.out.println("SOMA: " + soma);
            }
            case 2 -> {
                System.out.print("Informe o primeiro numero: ");
                double primeiroNumero = scanner.nextDouble();
                System.out.print("Informe o segundo numero: ");
                double segundoNumero = scanner.nextDouble();

                double diferenca = (primeiroNumero > segundoNumero) ? (primeiroNumero - segundoNumero) :
                        (segundoNumero - primeiroNumero);

                System.out.println("DIFERENCA: " + diferenca);
            }
            case 3 -> {
                double multiplicacao = 1;
                for (int i = 1; i <= 2; i++) {
                    System.out.print("Informe o [" + i + "] numero: ");
                    double numero = scanner.nextDouble();

                    multiplicacao *= numero;
                }
                System.out.println("PRODUTO: " + multiplicacao);
            }
            case 4 -> {
                System.out.print("Informe o primeiro numero: ");
                double primeiro = scanner.nextDouble();
                System.out.print("Informe o segundo numero: ");
                double segundo = scanner.nextDouble();

                if (primeiro == 0 || segundo == 0)
                    System.out.println("numero invalido! nao pode dividir por zero");
                else
                    System.out.println("DIVISAO: " + (primeiro / segundo));
            }
            default -> System.out.println("opcao invalida!");
        }

        scanner.close();
    }

}
