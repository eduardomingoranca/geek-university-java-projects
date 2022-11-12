import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));

            System.out.print("Escreva algo: ");
            String msg = scanner.nextLine();
            escrever.println(msg);

            escrever.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel criar o arquivo!");
        }

        scanner.close();
    }
}
