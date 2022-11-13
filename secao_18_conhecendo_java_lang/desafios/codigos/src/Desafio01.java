import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Escreva um programa que:
 * (a) Crie/abra um arquivo texto de nome "arq.txt"
 * (b) Permita que o usuario grave diversos caracteres esse arquivo, ate que o usuario
 *     entre com o caractere "0"
 * (c) Feche o arquivo
 * Agora, abra e leia o arquivo, caractere por caractere, e escreva na tela todos os caracteres
 * armazenados.
 */
public class Desafio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintStream writer = new PrintStream(new FileOutputStream("arq.txt", true));
            Scanner read = new Scanner(new FileInputStream("arq.txt"));

            System.out.print("Informe um caractere: ");
            String msg = scanner.nextLine();

            while (!msg.equalsIgnoreCase("0")) {
                writer.println(msg);

                System.out.print("Informe um caractere: ");
                msg = scanner.nextLine();
            }

            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println(line);
            }

            read.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }

        scanner.close();
    }
}

