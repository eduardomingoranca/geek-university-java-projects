import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Lendo arquivos
 */
public class Main02 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new FileInputStream("entrada.txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }

    }
}
