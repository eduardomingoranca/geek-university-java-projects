import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Faca um programa que recebe como entrada o nome de um arquivo de entrada e o nome
 * de um arquivo de saida. Cada linha do arquivo de entrada possui colunas de tamanho
 * de 30 caracteres. No arquivo de saida devera ser escrito o arquivo de entrada de forma
 * inversa. Veja um exemplo:
 * <p>
 * Arquivo de entrada:
 * Hoje eh dia de prova de AP
 * A prova esta muito facil
 * Vou tirar uma boa nota
 * <p>
 * Arquivo de saida:
 * Aton aob amu rarit uov
 * Licaf otium atse avorp A
 * PA ed avorp ed aid eh ejoH
 */
public class Desafio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintStream writer = new PrintStream(new FileOutputStream("reverse.txt", true));
            Scanner read = new Scanner(new FileInputStream("textos.txt"));

            while (read.hasNextLine()) {
                String reverse = new StringBuilder(read.nextLine()).reverse().toString();
                writer.println(reverse);
            }

            read.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }

        scanner.close();
    }
}

