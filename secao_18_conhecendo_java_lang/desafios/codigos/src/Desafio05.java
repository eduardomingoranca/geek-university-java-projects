import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Faca um programa que receba do usuario um arquivo texto e um caracter. Mostre na tela
 * quantas vezes aquele caractere ocorre dentro do arquivo.
 */
public class Desafio05 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("character.txt"));
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe um caracter: ");
            String caracter = scanner.nextLine();

            int quantidade = 0;
            while (read.hasNextLine()) {
                String character = read.nextLine();
                if (character.equalsIgnoreCase(caracter))
                    quantidade++;
            }

            System.out.println("O caracter " + caracter + " se repete " + quantidade + " vez(es).");

            scanner.close();
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
