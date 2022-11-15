import java.io.*;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/**
 * Dado um arquivo contendo um conjunto de nome e data de nascimento (DD MM AAAA,
 * isto eh, 3 inteiros em sequencia), faca um programa que leia o nome do arquivo e a data
 * de hoje e construa outro arquivo contendo o nome e a idade de cada pessoa do primeiro
 * arquivo.
 */
public class Desafio14 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Scanner read = new Scanner(new FileInputStream("dadosPessoais.txt"));

            System.out.println("O nome do arquivo eh: " + new File("dadosPessoais.txt").getName());
            System.out.println("Data hoje: " + LocalDate.now());

            System.out.println("===============================");
            System.out.print("Informe o nome do outro arquivo: ");
            String fileName = scanner.nextLine();

            PrintStream writer = new PrintStream(new FileOutputStream(fileName, true));
            while (read.hasNextLine()) {
                writer.println(read.nextLine());
            }

            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
