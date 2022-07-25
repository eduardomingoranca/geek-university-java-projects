import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Leia o salario de um trabalhador e o valor da prestacao de um emprestimo. Se a
 * prestacao for maior que 20% do salario imprima: Emprestimo nao concedido, caso
 * contrario imprima: Emprestimo concedido.
 */
public class Desafio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salario: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Informe o valor da prestacao do emprestimo: R$ ");
        double emprestimo = scanner.nextDouble();

        String concederEmprestimo = (emprestimo > (salario * 0.20)) ? "Emprestimo nao concedido"
                : "Emprestimo concedido";

        System.out.println(concederEmprestimo);

        scanner.close();
    }
}
