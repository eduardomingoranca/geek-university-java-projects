import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 *  Faca um programa que recebe um vetor de 10 numeros, converta cada um desses
 *  numeros para binario e grave a sequencia de 0s e 1s em um arquivo texto. Cada numero
 *  deve ser gravado em uma linha.
 */
public class Desafio16 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int[] vet = new int[10];

            for (int i = 0; i < vet.length; i++) {
                System.out.print("VET[" + i + "]: ");
                vet[i] = parseInt(scanner.nextLine());
            }

            for (int i = 0; i < vet.length; i++) {
                if (i % 2 == 0) vet[i] = 0;
            }

            for (int i = 0; i < vet.length; i++) {
                if (i % 2 != 0) vet[i] = 1;
            }

            System.out.print("Informe o nome do arquivo de saida: ");
            String fileOut = scanner.nextLine();

            PrintStream writer = new PrintStream(new FileOutputStream(fileOut.concat(".txt"), true));

            for (int j : vet) {
                writer.println(j);
            }

            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
