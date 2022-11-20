import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Faca um programa que recebe como entrada o nome de um arquivo de entrada e o nome
 * de um arquivo de saida. O arquivo de entrada contem o nome de um aluno e tres inteiros
 * que indicam suas notas. O programa devera ler o arquivo de entrada e gerar um arquivo
 * de saida onde aparece o nome do aluno e as suas notas em ordem crescente.
 */
public class Desafio22Output {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("boletim.txt"));
            PrintStream writer = new PrintStream(new FileOutputStream("boletimOutput.txt", true));

            writer.print(read.nextLine().substring(0, 11) + " ");

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
