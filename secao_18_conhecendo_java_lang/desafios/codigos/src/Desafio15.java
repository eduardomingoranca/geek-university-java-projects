import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Faca um programa que receba como entrada o ano corrente e o nome de dois arquivos:
 * um de entrada e outro de saida. Cada linha do arquivo de entrada contem o nome de
 * uma pessoa (ocupando 40 caracteres) e o seu ano de nascimento. O programa devera
 * ler o arquivo de entrada e gerar um arquivo de saida onde aparece o nome da pessoa
 * seguida por uma string que representa a sua idade.
 *      * Se a idade for menor do que 18 anos, escreva "menor de idade"
 *      * Se a idade for maior do que 18 anos, escreva "maior de idade"
 *      * Se a idade for igual a 18 anos, escreva "entrando na maior idade"
 */
public class Desafio15 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Scanner read = new Scanner(new FileInputStream("ageInput.txt"));

            System.out.print("Informe o ano corrente: ");
            int ano = parseInt(scanner.nextLine());

            System.out.print("Informe o nome do arquivo de saida: ");
            String fileOut = scanner.nextLine();

            PrintStream writer = new PrintStream(new FileOutputStream(fileOut.concat(".txt"), true));
            while (read.hasNextLine()) {
                String line = read.nextLine();
                int age = parseInt(line.substring(24, 28));

                if (ano - age > 18)
                    writer.println(line.concat("    maior de idade"));

                if (ano - age == 18)
                    writer.println(line.concat("    entrando na maior idade"));

                if (ano - age < 18)
                    writer.println(line.concat("    menor de idade"));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
