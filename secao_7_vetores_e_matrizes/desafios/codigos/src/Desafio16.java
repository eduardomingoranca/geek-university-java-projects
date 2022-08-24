import java.util.Scanner;

/**
 * Faca um programa que leia um vetor de 5 posicoes para numeros reais e, depois, um
 * codigo inteiro. Se o codigo for zero, finalize o programa; se for 1, mostre o vetor
 * na ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o codigo for diferente
 * de 1 e 2 escreva uma mensagem informando que o codigo eh invalido.
 */
public class Desafio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[5];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Informe [" + (i+1) + "] numero: ");
            vet[i] = scanner.nextDouble();
        }

        int opcao;
        do {
            System.out.println("===========================");
            System.out.println("| [1] VETOR ORDEM DIRETA  |");
            System.out.println("| [2] VETOR ORDEM INVERSA |");
            System.out.println("|         [0] FIM         |");
            System.out.println("===========================");

            System.out.print("Informe uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    for (double v : vet) System.out.print(" " + v);
                    System.out.println();
                }
                case 2 -> {
                    for (int j = vet.length - 1; j >= 0; j--)
                        System.out.print(" " + vet[j]);
                    System.out.println();
                }
                case 0 -> System.out.println("FIM");
                default -> System.out.println("CODIGO INVALIDO!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
