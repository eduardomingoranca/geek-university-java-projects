package sobrecarga;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TestaPessoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o codigo da pessoa: ");
        int codigo = parseInt(scanner.nextLine());

        System.out.print("Informe a idade da pessoa: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa();
        pessoa.setCodigo(codigo);
        pessoa.setIdade(idade);
        pessoa.setNome(nome);
        System.out.println(pessoa.exibe(1));
        System.out.println(pessoa.exibe(0));
        System.out.println(pessoa.exibe());

        System.out.println("=====================================");

        System.out.println(new Pessoa(codigo, nome, idade).exibe());

        scanner.close();
    }
}
