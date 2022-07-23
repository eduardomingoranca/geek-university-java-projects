import java.util.Scanner;

/**
 * Implemente um programa que calcule o ano de nascimento de uma pessoa a partir de
 * sua idade e do ano atual.
 */
public class Desafio50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe o ano: ");
        int ano = scanner.nextInt();

        int anoNascimento = ano - idade;

        System.out.println("Ano de Nascimento: " + anoNascimento);

        scanner.close();
    }
}
