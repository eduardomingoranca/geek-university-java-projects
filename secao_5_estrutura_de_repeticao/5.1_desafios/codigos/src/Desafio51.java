import java.util.Scanner;

/**
  Um funcionario recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996
  recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro
  do ano anterior. Faca programa que determine o salario atual do funcionario.
 */
public class Desafio51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = 2000;
        int ano = 1996;

        while (ano <= 2022) {
            salario *= 1.015;
            ano+=1;
        }

        System.out.printf("SALARIO NOVO: R$ %.2f", salario);
        scanner.close();
    }
}
