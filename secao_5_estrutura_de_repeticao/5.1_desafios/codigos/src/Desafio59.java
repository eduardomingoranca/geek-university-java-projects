import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
  Escreva um programa que leia o numero de habitantes de uma determinada cidade, o
  valor do kwh, o para cada habitante entre com os seguintes dados: consumo do mes
  e o codigo do consumidor (1 - Residencial, 2 - Comercial, 3 - Industrial). No final
  imprima o maior, o menor e a media do consumo dos habitantes: e por fim o total do
  consumo de cada categoria de consumidor.
 */
public class Desafio59 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numero de habitantes: ");
        int numeroHabitantes = scanner.nextInt();

        System.out.print("Informe o valor do kwh R$: ");
        double valorKwh = scanner.nextDouble();

        double maior = MIN_VALUE;
        double menor = MAX_VALUE;
        double soma = 0;
        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;
        for (int i = 1; i <= numeroHabitantes; i++) {
            System.out.println("====================================");
            System.out.println(" | [1] RESIDENCIAL | [2] COMERCIAL |");
            System.out.println(" |         [3] INDUSTRIAL          |");
            System.out.println("====================================");

            System.out.print("Selecione uma opcao: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1, 2, 3 -> {
                    System.out.print("Informe o consumo do mes R$ ");
                    double consumoMes = scanner.nextDouble();
                    soma += consumoMes;
                    if (opcao == 1) totalResidencial += consumoMes;
                    if (opcao == 2) totalComercial += consumoMes;
                    if (opcao == 3) totalIndustrial += consumoMes;

                    if (consumoMes > maior) maior = consumoMes;
                    if (consumoMes < menor) menor = consumoMes;
                }
                default -> System.out.print("OPCAO INVALIDA!");
            }

        }

        System.out.println("MAIOR: " + maior + " MENOR: " + menor + " MEDIA DO CONSUMO: " +
                        (soma / numeroHabitantes) + " CONSUMO RESIDENCIAL: " + totalResidencial +
                        " CONSUMO COMERCIAL: " + totalComercial + " CONSUMO INDUSTRIAL: " + totalIndustrial);

        scanner.close();
    }

}
