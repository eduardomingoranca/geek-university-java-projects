import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Faca um programa que receba do usuario um arquivo texto e mostre na tela quantas
 * letras sao vogais e quantas sao consoantes.
 */
public class Desafio04 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("vowel-consonant.txt"));

            int contadorVogal = 0;
            int contadorConsoante = 0;
            while (read.hasNextLine()) {
                String vowel = read.nextLine();
                if (vowel.equalsIgnoreCase("a") || vowel.equalsIgnoreCase("e")
                || vowel.equalsIgnoreCase("i") || vowel.equalsIgnoreCase("o")
                || vowel.equalsIgnoreCase("u")) {
                    contadorVogal++;
                } else contadorConsoante++;
            }

            System.out.println("TOTAL DE VOGAIS:  " + contadorVogal);
            System.out.println("TOTAL DE CONSOANTES: " + contadorConsoante);

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
