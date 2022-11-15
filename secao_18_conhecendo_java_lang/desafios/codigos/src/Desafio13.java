import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Faca um programa que permita que o usuario entre com diversos nomes e telefone para
 * cadastro, e crie um arquivo com essas informacoes, uma por linha. O usuario finaliza a
 * entrada com '0' para o telefone.
 */
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            PrintStream writer = new PrintStream(new FileOutputStream("lista.txt", true));
            Scanner read = new Scanner(new FileInputStream("lista.txt"));

            System.out.print("Informe o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o numero do telefone [0 - sair]: ");
            int numeroTelefone = Integer.parseInt(scanner.nextLine());

            while (numeroTelefone != 0) {
                writer.println(nome);
                writer.println(numeroTelefone);

                System.out.print("Informe o nome: ");
                nome = scanner.nextLine();

                System.out.print("Informe o numero do telefone [0 - sair]: ");
                numeroTelefone = Integer.parseInt(scanner.nextLine());
            }

            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println(line);
            }

            read.close();
            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }

    }
}
