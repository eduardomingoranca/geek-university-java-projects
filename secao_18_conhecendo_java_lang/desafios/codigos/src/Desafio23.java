import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Escreva um programa que leia a profissao e o tempo de servico (em anos) de cada um
 * dos 5 funcionarios de uma empresa e armazene-os no arquivo "emp.txt". Cada linha
 * do arquivo corresponse aos dados de um funcionario.
 */
public class Desafio23 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            PrintStream writer = new PrintStream(new FileOutputStream("emp.txt", true));

            for (int i = 0; i < 5; i++) {
                System.out.print("Informe a profissao: ");
                String profissao = scanner.nextLine();

                System.out.print("Informe o tempo de servico (em anos): ");
                int tempoServico = parseInt(scanner.nextLine());

                writer.println(profissao + " " + tempoServico);
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
