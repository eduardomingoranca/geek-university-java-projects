import java.util.Scanner;

/**
 * Leia a idade e o tempo de servico de um trabalhador e escreva se ele pode ou nao se
 * aposentar. As condicoes para aposentadoria sao
 *      * Ter pelo menos 65 anos,
 *      * Ou ter trabalhado pelo menos 30 anos,
 *      * Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos.
 */
public class Desafio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe o tempo de servico: ");
        int tempo = scanner.nextInt();

        System.out.println((idade >= 65 || tempo >= 30 || idade >= 60 && tempo >= 25) ?
                "pode aponsentar!" : "pode nao se aposentar!");

        scanner.close();
    }
}
