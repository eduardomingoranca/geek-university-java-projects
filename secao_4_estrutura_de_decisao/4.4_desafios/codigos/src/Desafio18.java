import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * Faca um programa que mostre ao usuario um menu com 4 opcoes de operacoes matematicas
 * (as basicas, por exemplo). O usuario escolhe uma das opcoes e o seu programa
 * entao pede dois valores numericos e realiza a operacao, mostrando o resultado e
 * saindo.
 */
public class Desafio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================== ");
        System.out.println("======= OPERACOES MATEMATICAS ====== ");
        System.out.println("==================================== ");
        System.out.println(" [1] > ADICAO  | [2] > MULTIPLICACAO ");
        System.out.println(" [3] > DIVISAO | [4] > SUBTRACAO ");
        System.out.println("==================================== ");

        System.out.print("Selecione uma opcao: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                double adicao = 0.0;
                for (int i = 1; i <= 2; i++) {
                    System.out.print("Informe o [" + i + "] numero: ");
                    double numero = scanner.nextDouble();

                    adicao += numero;
                }
                System.out.println("ADICAO: " + adicao);
            }
            case 2 -> {
                double multiplicacao = 1;
                for (int i = 1; i <= 2; i++) {
                    System.out.print("Informe o [" + i + "] numero: ");
                    double numero = scanner.nextDouble();

                    multiplicacao *= numero;
                }
                System.out.println("MULTIPLICACAO: " + multiplicacao);
            }
            case 3 -> {
                System.out.print("Informe o primeiro numero: ");
                double primeiro = scanner.nextDouble();
                System.out.print("Informe o segundo numero: ");
                double segundo = scanner.nextDouble();
                System.out.println("DIVISAO: " + (primeiro / segundo));
            }
            case 4 -> {
                System.out.print("Informe o primeiro numero: ");
                double primeiroNumero = scanner.nextDouble();
                System.out.print("Informe o segundo numero: ");
                double segundoNumero = scanner.nextDouble();
                System.out.println("SUBTRACAO: " + (primeiroNumero - segundoNumero));
            }
            default -> System.out.println("opcao invalida!");
        }

        scanner.close();
    }

}
