import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Faca um programa que receba do usuario um arquivo texto e mostre na tela quantas
 * letras sao vogais.
 */
public class Desafio03 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("vowel.txt"));

            int contadorVogal = 0;
            while (read.hasNextLine()) {
                String vowel = read.nextLine();
                if (vowel.equalsIgnoreCase("a") || vowel.equalsIgnoreCase("e")
                || vowel.equalsIgnoreCase("i") || vowel.equalsIgnoreCase("o")
                || vowel.equalsIgnoreCase("u")) {
                    contadorVogal++;
                }
            }

            System.out.println("TOTAL DE VOGAIS:  " + contadorVogal);

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
