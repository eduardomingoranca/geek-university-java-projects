import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Faca um programa que receba do usuario um arquivo texto e mostre na tela quantas
 * linhas esse arquivo possui.
 */
public class Desafio02 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("input.txt"));

            int contador = 0;
            while (read.hasNextLine()) {
                read.nextLine();
                contador++;
            }

            System.out.println("Esse arquivo possui " + contador + " linhas.");

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
