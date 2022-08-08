import com.sun.jdi.IntegerType;

import java.util.Scanner;

/**
 * Receba dados do usuario enquanto a idade for maior que 0
 */

// while e do while
public class Programa01 {

    public static void main(String[] args) {

        int idade = 1;
        String nome;

        // Para receber dados do usuario via teclado
        Scanner teclado = new Scanner(System.in);

        // Sempre checa o valor antes de executar o bloco
        while(idade > 0) {
            System.out.print("Infome o nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe a idade: ");
            // idade = teclado.nextInt(); // Bug
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos.");
        }

        teclado.close();
    }
}
