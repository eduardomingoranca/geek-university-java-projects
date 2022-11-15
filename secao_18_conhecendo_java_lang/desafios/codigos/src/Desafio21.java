import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Double.MIN_VALUE;
import static java.lang.Double.parseDouble;

/**
 * Crie um programa que receba como entrada o numero de alunos de uma disciplina.
 * Aloque dinamicamente em uma estrutura para armazenar as informacoes a respeito
 * desses alunos: nome do aluno e sua nota final. Em seguida, salve os dados dos
 * alunos em um arquivo binario. Por fim, leia o arquivo e mostre o nome do aluno
 * com a maior nota.
 */
public class Desafio21 {

    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(new FileInputStream("quimica.txt"));
            PrintStream writer = new PrintStream(new FileOutputStream("quimicaBinario.txt", true));

            double bigger = MIN_VALUE;
            String lines = null;
            while (read.hasNextLine()) {
                String line = read.nextLine();
                double nota = parseDouble(line.substring(12, 16));

                if (nota > bigger) {
                    bigger = nota;
                    lines = line;
                }

                String[] split = line.split(Desafio12.REGEX);
                for (int i = 0; i < split.length; i++) {
                    if (i % 2 == 0) split[i] = "0";
                    if (i % 2 != 0) split[i] = "1";
                }

                for (String s : split) {
                    writer.print(s + " ");
                }
            }

            System.out.println(lines);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
