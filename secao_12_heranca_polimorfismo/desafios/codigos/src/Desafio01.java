import java.util.Scanner;

/**
 * Escreva um codigo em Java que apresente a classe Pessoa, com atributos nome,
 * endereco e telefone e, o metodo imprimir. O metodo imprimir deve mostrar na
 * tela os valores de todos os atributos.
 */
public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o endereco: ");
        String endereco = scanner.nextLine();

        System.out.print("Informe o telefone: ");
        long telefone = Long.parseLong(scanner.nextLine());

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);

        System.out.println(pessoa);

        scanner.close();
    }
}
