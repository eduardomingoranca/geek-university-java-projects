import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.parseInt;

/**
 * Faca um programa que receba o nome de um arquivo de entrada e outro de saida. O
 * arquivo de entrada contem em cada linha o nome de uma cidade (ocupando 40 caraacteres)
 * e o seu numero de habilidades. O programa devera ler o arquivo de entrada e gerar
 * um arquivo de saida onde aparece o nome da cidade mais populosa seguida pelo seu
 * numero de habitantes.
 */
public class Desafio10 {

    public static void main(String[] args) {

        try {
            Scanner read = new Scanner(new FileInputStream("login.txt"));

            String lines = null;
            int bigger = MIN_VALUE;
            while (read.hasNextLine()) {
                String line = read.nextLine();
                int numberOfInhabitants = parseInt(line.substring(12, 15));

                if (numberOfInhabitants > bigger) {
                    bigger = numberOfInhabitants;
                }
                lines = line;
            }

            assert lines != null;
            if (bigger == parseInt(lines.substring(12, 15))) {
                PrintStream writer = new PrintStream(new FileOutputStream("exit.txt", true));
                writer.println(lines);
            }

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
