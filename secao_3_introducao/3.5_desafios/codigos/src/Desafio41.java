import java.util.Scanner;

/**
 * Faca um programa que leia o valor da hora de trabalho (em reais) e numero de horas
 * trabalhadas no mes. Imprima o valor a ser pago ao funcionario, adicionando 10% sobre
 * o valor calculado.
 */
public class Desafio41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da hora de trabalho R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Informe o numero de horas trabalhadas no mes: ");
        int horaTrabalhada = scanner.nextInt();

        double salario = (horaTrabalhada * valorHora) * 1.10;

        System.out.println("O salario do funcionario de trabalhou " + horaTrabalhada + " hrs com o valor da hora de R$ "
                + valorHora + " eh: R$ " + salario);

        scanner.close();
    }
}
