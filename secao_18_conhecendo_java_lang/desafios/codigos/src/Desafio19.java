import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Double.MIN_VALUE;
import static java.lang.Double.parseDouble;

/**
 * Faca um programa que receba do usuario um arquivo que contenha o nome e a nota de
 * diversos alunos (da seguinte forma: NOME: JOAO NOTA: 8), um aluno por linha. Mostre
 * na tela o nome e a nota do aluno que possui a maior nota.
 */
public class Desafio19 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("boletimEscolar.txt"));

            double bigger = MIN_VALUE;
            String lines = null;
            while (read.hasNextLine()) {
                String line = read.nextLine();
                double nota = parseDouble(line.substring(22, 25));

                if (nota > bigger) {
                    bigger = nota;
                    lines = line;
                }
            }

            System.out.println(lines);

            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
