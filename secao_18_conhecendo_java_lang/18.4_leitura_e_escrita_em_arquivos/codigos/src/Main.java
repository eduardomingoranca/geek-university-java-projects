import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Escrevendo arquivos
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            /*
             * Desta forma, toda vez que o programa for executado,
             * o arquivo sera recriado e toda a informacao, se pre-existente
             * sera excluida, recomecando um arquivo zerado.
             */
            PrintStream escrever = new PrintStream("saida.txt");

            for (int i = 0; i < 5; i++) {
                System.out.print("Escreva algo: ");
                String msg = scanner.nextLine();
                escrever.println(msg);
            }

            escrever.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel criar o arquivo!");
        }

        scanner.close();
    }
}
