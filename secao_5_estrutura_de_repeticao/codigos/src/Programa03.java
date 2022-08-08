import java.util.Scanner;

// for
public class Programa03 {

    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner teclado = new Scanner(System.in);

        // variavel de controle; condicao de parada; forma de incremento
        // i++ -> i = i + i
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe a idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0) System.out.println(nome + " tem " + idade + " anos.");
        }

        teclado.close();
    }
}
