import java.util.Scanner;

/**
 * Receba o salario-base de um funcionario. Calcule e imprima o salario a receber, sabendo-se
 * que esse funcionario tem uma gratificacao de 5% sobre o salario-base. Alem disso,
 * ele paga 7% de imposto sobre o salario-base.
 */
public class Desafio42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salario-base do funcionario: R$ ");
        double salarioBase = scanner.nextDouble();

        double salarioAReceber = (salarioBase * 1.05) - (salarioBase * 0.07);

        System.out.println("Com o salario-base de R$ " + salarioBase +
                " o salario a receber eh: R$ " + salarioAReceber);

        scanner.close();
    }
}
