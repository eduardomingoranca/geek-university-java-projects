import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Faca um programa que receba do usuario um arquivo texto. Crie outro arquivo texto
 * contendo o texto do arquivo de entrada, mas com as vogais substituidas por "*"
 */
public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintStream writer = new PrintStream(new FileOutputStream("asterisk.txt", true));

            System.out.print("Informe uma letra: ");
            String msg = scanner.nextLine();

            if (msg.equalsIgnoreCase("a") || msg.equalsIgnoreCase("e") ||
                msg.equalsIgnoreCase("i") || msg.equalsIgnoreCase("o") ||
                msg.equalsIgnoreCase("u")) {
                msg = "*";
            }
            writer.println(msg);

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel criar o arquivo!");
        }
    }
}
