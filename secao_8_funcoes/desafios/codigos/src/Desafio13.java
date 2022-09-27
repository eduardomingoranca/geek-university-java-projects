import java.util.Scanner;

import static java.lang.Double.parseDouble;

/**
 * Faca uma funcao que receba dois valores numericos e um simbolo. Este simbolo representara
 * a operacao que se deseja efetuar com os numeros. Se o simbolo for + devera ser realizada uma
 * adicao, se for - uma subtracao, se for / uma divisao e se for * sera efetuada uma multiplicacao.
 */
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        double n1 = parseDouble(scanner.nextLine());

        System.out.print("Informe o segundo numero: ");
        double n2 = parseDouble(scanner.nextLine());

        System.out.print("Informe o simbolo da equacao [+, -, /, *]: ");
        String simbolo = scanner.nextLine();

        if (simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/"))
            System.out.println("O resultado da operacao eh: " + operacaoMatematica(n1, n2, simbolo));
        else System.out.println("SIMBOLO INVALIDO!");

        scanner.close();
    }

    private static double operacaoMatematica(double n1, double n2, String simbolo) {
        double operacao = 0;
        switch (simbolo) {
            case "+" -> operacao = n1 + n2;
            case "-" -> operacao = n1 - n2;
            case "/" -> operacao = n1 / n2;
            case "*" -> operacao = n1 * n2;
        }
        return operacao;
    }

}
