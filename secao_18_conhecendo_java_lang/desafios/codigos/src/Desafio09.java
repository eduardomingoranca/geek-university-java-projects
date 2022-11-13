import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Faca um programa que receba dois arquivos do usuario, e crie um terceiro arquivo com
 * o conteudo dos dois primeiros juntos (o conteudo do primeiro seguido do conteudo do
 * segundo).
 */
public class Desafio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Scanner read = new Scanner(new FileInputStream("enter.txt"));
            Scanner readFile = new Scanner(new FileInputStream("entrada.txt"));

            System.out.print("Informe o nome do arquivo: ");
            String fileName = scanner.nextLine();

            PrintStream write = new PrintStream(new FileOutputStream(fileName, true));

            while (read.hasNextLine()) {
                String line = read.nextLine();
                write.println(line);
            }

            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                write.println(line);
            }

            readFile.close();
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel criar o arquivo!");
        }
    }
}
