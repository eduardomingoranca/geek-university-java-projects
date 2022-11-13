import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Faca um programa que leia o conteudo de um arquivo e crie um arquivo com o mesmo
 * conteudo, mas com todas as letras minusculas convertidas para minusculas. Os nomes
 * dos arquivos serao fornecidos, via teclado, pelo usuario. A funcao que converte
 * maiuscula para minuscula e o toUpperCase(). Ela eh aplicada em cada caractere da string.
 */
public class Desafio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe o nome do arquivo: ");
            String fileName = scanner.nextLine();

            PrintStream write = new PrintStream(new FileOutputStream(fileName, true));
            Scanner read = new Scanner(new FileInputStream(fileName));

            System.out.print("Informe uma letra [0 - para sair]: ");
            String letter = scanner.nextLine();

            while (!letter.equals("0")) {
                write.println(letter);

                System.out.print("Informe uma letra [0 - para sair]: ");
                letter = scanner.nextLine();
            }

            while (read.hasNextLine()) {
                String line = read.nextLine();
                PrintStream writeUpper = new PrintStream(new FileOutputStream("maiuscula.txt", true));
                writeUpper.println(line.toUpperCase());
            }

            write.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel criar o arquivo!");
        }

    }
}
