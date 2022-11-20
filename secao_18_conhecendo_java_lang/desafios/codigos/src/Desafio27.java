import java.io.*;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

/**
 * Faca um programa para gerenciar as notas dos alunos de uma turma salva em um arquivo.
 * O programa devera ter um menu contendo as seguintes opcoes:
 * (a) Inserir aluno e notas;
 * (b) Exibir alunos e medias;
 * (c) Exibir alunos aprovados;
 * (d) Exibir alunos reprovados;
 * (e) Sair do programa (fim).
 * Faca a rotina que gerencia o menu dentro do main, e para cada uma das opcoes deste
 * menu, crie uma funcao especifica.
 */
public class Desafio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintStream writer = new PrintStream(new FileOutputStream("notas.txt", true));
            Scanner read = new Scanner(new FileInputStream("notas.txt"));

            String opcao;

            do {
                System.out.println("================================");
                System.out.println("| [A] INSERIR ALUNO E NOTAS    |");
                System.out.println("| [B] EXIBIR ALUNOS E MEDIAS   |");
                System.out.println("| [C] EXIBIR ALUNOS APROVADOS  |");
                System.out.println("| [D] EXIBIR ALUNOS REPROVADOS |");
                System.out.println("| [E] SAIR DO PROGRAMA (FIM)   |");
                System.out.println("================================");

                System.out.print("Informe uma opcao: ");
                opcao = scanner.nextLine();

                if ("a".equalsIgnoreCase(opcao)) {
                    System.out.print("Informe o nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe a nota 1: ");
                    double nota1 = parseDouble(scanner.nextLine());

                    System.out.print("Informe a nota 2: ");
                    double nota2 = parseDouble(scanner.nextLine());

                    System.out.print("Informe a nota 3: ");
                    double nota3 = parseDouble(scanner.nextLine());

                    inserir(nota1, nota2, nota3, nome, writer);
                } else if ("b".equalsIgnoreCase(opcao)) {
                    while (read.hasNextLine()) {
                        System.out.println(read.nextLine());
                    }
                } else if ("c".equalsIgnoreCase(opcao)) {
                    BufferedReader reader = new BufferedReader(new FileReader("notas.txt"));
                    aprovados(reader);
                } else if ("d".equalsIgnoreCase(opcao)) {
                    BufferedReader reader = new BufferedReader(new FileReader("notas.txt"));
                    reprovados(reader);
                }
                else if ("e".equalsIgnoreCase(opcao)) System.out.println("FIM!");
                else System.out.println("OPCAO INVALIDA!");

            } while (!"e".equalsIgnoreCase(opcao));

            writer.close();
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }

    private static void reprovados(BufferedReader reader) throws IOException {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            if (parseDouble(currentLine.substring(0, 3))  < 7.0) {
                System.out.println(currentLine.substring(16));
            }
        }
    }

    private static void aprovados(BufferedReader reader) throws IOException {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            if (parseDouble(currentLine.substring(0, 3))  >= 7.0) {
                System.out.println(currentLine.substring(16));
            }
        }
    }

    private static void inserir(double nota1, double nota2, double nota3, String nome, PrintStream writer) {
        double media = (nota1 + nota2 + nota3) / 3.0;
        writer.println(media + " " + nota1 + " " + nota2 + " " + nota3 + " " + nome);
    }


}

