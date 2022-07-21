import java.util.Scanner;

/**
 * Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, sabendo que
 * ele recebeu um aumento de 25%.
 */
public class Desafio38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salario do funcionario R$ ");
        double salario = scanner.nextDouble();

        double novoSalario = salario + (salario * 0.25);


        System.out.println("O salario do funcionario que era de R$ " + salario + " com o aumento de 25% ficou em R$ " +
                novoSalario);

        scanner.close();
    }
}
