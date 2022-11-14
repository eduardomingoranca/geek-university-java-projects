import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Faca um programa no qual o usuario informa o nome do arquivo e uma palavra, e retorne
 * o numero de vezes que aquela palavra aparece no arquivo.
 */
public class Desafio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Informe o nome do arquivo: ");
            String fileName = scanner.nextLine();

            Scanner read = new Scanner(new FileInputStream(fileName));

            System.out.print("Informe uma letra ou palavra que procura: ");
            String search = scanner.nextLine();

            int quantidade = 0;
            while (read.hasNextLine()) {
                String word = read.nextLine();
                if (search.equalsIgnoreCase(word)) {
                    quantidade++;
                }
            }

            System.out.println("A informacao que procura aparece " + quantidade + " vezes no arquivo!");

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
