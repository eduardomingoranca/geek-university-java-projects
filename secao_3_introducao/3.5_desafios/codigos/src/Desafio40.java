import java.util.Scanner;

/**
 * Uma empresa contrata um encanador a R$ 30,00 por dia. Faca um programa que solicite
 * o numero de dias trabalhados pelo encanador e imprima a quantia liquida que devera ser
 * paga, sabendo-se que sao descontados 8% para imposto de renda.
 */
public class Desafio40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de dias trabalhados pelo encanador: ");
        int diasTrabalhados = scanner.nextInt();

        double quantiaLiquida = (diasTrabalhados * 30.00) - ((diasTrabalhados * 30.00) * 0.08);

        System.out.println("O encanador trabalhou " + diasTrabalhados + " dias e recebeu a quantia liquida de R$ " + quantiaLiquida);

        scanner.close();
    }
}
