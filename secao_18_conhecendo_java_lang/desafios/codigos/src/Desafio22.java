import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Faca um programa que recebe como entrada o nome de um arquivo de entrada e o nome
 * de um arquivo de saida. O arquivo de entrada contem o nome de um aluno e tres inteiros
 * que indicam suas notas. O programa devera ler o arquivo de entrada e gerar um arquivo
 * de saida onde aparece o nome do aluno e as suas notas em ordem crescente.
 */
public class Desafio22 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("boletim.txt"));
            PrintStream writer = new PrintStream(new FileOutputStream("boletimOutput.txt", true));

            while (read.hasNextLine()) {
                String[] s = read.nextLine().substring(16, 21).split(" ");
                int[] vet = new int[s.length];

                for (int i = 0; i < s.length; i++) {
                    vet[i] = parseInt(s[i]);
                }

                for (int i = 1; i < vet.length; i++) {
                    for (int j = 0; j < vet.length - i; j++) {
                        if (vet[j] > vet[j+1]) {
                            int temp = vet[j];
                            vet[j] = vet[j + 1];
                            vet[j + 1] = temp;
                        }
                    }
                }

                for (int j : vet) {
                    writer.print(j + " ");
                }
            }

            read.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
