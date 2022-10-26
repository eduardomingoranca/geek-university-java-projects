import java.util.Scanner;

/**
 * Baseando-se no exercicio 1 adicione um metodo construtor que permita a
 * definicao de todos os atributos no momento da instanciacao do objeto.
 */
public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o endereco: ");
        String endereco = scanner.nextLine();

        System.out.print("Informe o telefone: ");
        long telefone = Long.parseLong(scanner.nextLine());

        System.out.println(new Pessoa(nome, endereco, telefone).imprimePessoa());

        scanner.close();

    }
}
