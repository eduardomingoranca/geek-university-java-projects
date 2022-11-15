import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 * Crie um programa que receba como entrada o numero de alunos de uma disciplina.
 * Aloque dinamicamente dois vetores para armazenar as informacoes a respeito desses
 * alunos. O primeiro vetor contem o nome dos alunos e o segundo contem suas notas
 * finais. Crie um arquivo que armazene, a cada linha, o nome do aluno e sua nota final.
 */
public class Desafio20 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o nome da disciplina: ");
            String disciplina = scanner.nextLine();

            PrintStream writer = new PrintStream(new FileOutputStream(disciplina.concat(".txt"), true));

            System.out.print("Informe a quantidade de alunos da disciplina " + disciplina + ": ");
            int numeroAlunos = parseInt(scanner.nextLine());

            String[] nomeAlunos = new String[numeroAlunos];
            double[] notaAlunos = new double[numeroAlunos];

            for (int i = 0; i < nomeAlunos.length; i++) {
                System.out.print("NOME ALUNO[" + (i+1) +"]: ");
                nomeAlunos[i] = scanner.nextLine();
            }

            for (int i = 0; i < notaAlunos.length; i++) {
                System.out.print("NOTA ALUNO[" + (i+1) +"]: ");
                notaAlunos[i] = parseDouble(scanner.nextLine());
            }

            for (int i = 0; i < nomeAlunos.length; i++) {
                writer.println(nomeAlunos[i] + "\n" + notaAlunos[i]);
            }

            scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }
    }
}
