import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 *  Faca um programa gerenciar uma agenda de contatos. Para cada contato armazene o
 *  nome, o telefone e o aniversario (dia e mes). O programa deve permitir
 *      (a) inserir contato
 *      (b) remover contato
 *      (c) pesquisar um contato pelo nome
 *      (d) listar todos os contatos
 *      (e) listar os contatos cujo nome inicia com uma dada letra
 *      (f) imprimir os aniversariantes do mes.
 * Sempre que o programa for encerrado, os contatos devem ser armazenados em um
 * arquivo binario. Quando o programa iniciar, os contatos devem ser inicializados
 * com os dados contidos neste arquivo binario.
 * */
public class Desafio25 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            PrintStream writer = new PrintStream(new FileOutputStream("agenda.txt", true));

            System.out.println("======================= AGENDA CONTATOS =============================");
            System.out.println("|    (A) INSERIR CONTATO                                            |");
            System.out.println("|    (B) REMOVER CONTATO                                            |");
            System.out.println("|    (C) PESQUISAR UM CONTATO PELO NOME                             |");
            System.out.println("|    (D) LISTAR TODOS OS CONTATOS                                   |");
            System.out.println("|    (E) LISTAR OS CONTATOS CUJO NOME INICIA COM UMA DADA LETRA     |");
            System.out.println("|    (F) IMPRIMIR OS ANIVERSARIANTES DO MES                         |");
            System.out.println("=====================================================================");

            System.out.print("Informe uma opcao: ");
            String opcao = scanner.nextLine();

            if ("a".equalsIgnoreCase(opcao)) {
                System.out.print("Informe o nome do novo contato: ");
                String nome = scanner.nextLine();

                System.out.print("Informe o telefone do novo contato: ");
                int telefone = parseInt(scanner.nextLine());

                System.out.print("Informe o mes e dia do novo contato: ");
                int data = parseInt(scanner.nextLine());

                writer.println(nome + "   " + telefone + "   " + data);
            } else if ("b".equalsIgnoreCase(opcao)) {
                BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"));
                PrintStream write = new PrintStream(new FileOutputStream("agenda.txt", true));

                System.out.print("Informe o contato que deseja excluir: ");
                String lineToRemove = scanner.nextLine();

                String currentLine;

                while((currentLine = reader.readLine()) != null) {
                    if(currentLine.trim().substring(1, lineToRemove.length()).equalsIgnoreCase(lineToRemove)) continue;
                    write.print(currentLine + System.getProperty("line.separator"));
                }
            } else if ("c".equalsIgnoreCase(opcao)) {
                BufferedReader reads = new BufferedReader(new FileReader("agenda.txt"));

                System.out.print("Informe o nome do contato: ");
                String n = scanner.nextLine();

                String currentLine;

                while ((currentLine = reads.readLine()) != null) {
                    if (n.equalsIgnoreCase(currentLine.substring(0, n.length()))) System.out.println(currentLine);
                }
            } else if ("d".equalsIgnoreCase(opcao)) {
                Scanner read = new Scanner(new FileInputStream("agenda.txt"));

                while (read.hasNextLine()) {
                    System.out.println(read.nextLine());
                }
            } else if ("e".equalsIgnoreCase(opcao)) {
                BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"));

                System.out.print("Informe uma letra: ");
                String letra = scanner.nextLine();

                String currentLine;

                while ((currentLine = reader.readLine()) != null) {
                    if (letra.equalsIgnoreCase(currentLine.substring(0, 1))) {
                        System.out.println(currentLine);
                    }
                }
            } else if ("f".equalsIgnoreCase(opcao)) {
                BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"));

                System.out.print("Informe o numero do mes: ");
                int numeroMes = parseInt(scanner.nextLine());

                if (numeroMes > 12 || numeroMes < 1) {
                    System.out.println("NUMERO INVALIDO!");
                } else {
                    String currentLine;

                    while ((currentLine = reader.readLine()) != null) {
                        int mes  = parseInt(currentLine.substring(35, 36));
                        if (numeroMes == mes) {
                            System.out.println(currentLine);
                        }
                    }}
            } else System.out.println("OPCAO INVALIDA!");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
