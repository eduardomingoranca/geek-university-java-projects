import java.io.*;
import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static java.lang.System.getProperty;

/**
 *  Implemente um controle simples de mercadorias em uma despensa domestica. Para
 *  cada produto armazene um codigo numerico, descricao e quantidade atual. O programa
 *  deve ter opcoes para retirada de produtos, bem como um relatorio geral e um
 *  de produtos nao disponiveis. Armazene os dados em arquivo binario.
 */
public class Desafio24 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Scanner read = new Scanner(new FileInputStream("despensa.txt"));
            PrintStream binary = new PrintStream(new FileOutputStream("despensaBinario.txt", true));

            System.out.println("===== CONTROLE DESPENSA =====");
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
            System.out.println("=============================");

            System.out.print("Deseja excluir um item [s/n]: ");
            String opcao = scanner.nextLine();

            if ("s".equalsIgnoreCase(opcao)) {
                BufferedReader reader = new BufferedReader(new FileReader("despensa.txt"));
                PrintStream writer = new PrintStream(new FileOutputStream("despensaOutput.txt", true));
                BufferedReader reads = new BufferedReader(new FileReader("despensaOutput.txt"));

                System.out.print("Informe o produto que deseja excluir: ");
                String lineToRemove = scanner.nextLine();

                String currentLine;

                while((currentLine = reader.readLine()) != null) {
                    int length = lineToRemove.length() + 4;
                    if(currentLine.trim().substring(4, length).equalsIgnoreCase(lineToRemove)) continue;
                    writer.print(currentLine + System.getProperty("line.separator"));
                }

                System.out.print("Deseja pesquisar um produto [s/n]: ");
                String pesquisa = scanner.nextLine();

                if ("s".equalsIgnoreCase(pesquisa)) {
                    System.out.print("Informe o nome do produto: ");
                    String n = scanner.nextLine();

                    while ((currentLine = reads.readLine()) != null) {
                        int length = n.length() + 4;
                        if (n.equalsIgnoreCase(currentLine.substring(4, length))) System.out.println(currentLine);

                        int lReads = currentLine.length();
                        for (int i = 0; i < lReads; i++) {
                            if (i % 2 == 0) binary.print("0");
                            else binary.print("1");
                        }
                    }
                }

            } else {
                BufferedReader reads = new BufferedReader(new FileReader("despensa.txt"));

                System.out.print("Deseja pesquisar um produto [s/n]: ");
                String pesquisa = scanner.nextLine();

                String currentLine;

                if ("s".equalsIgnoreCase(pesquisa)) {
                    System.out.print("Informe o nome do produto: ");
                    String n = scanner.nextLine();

                    while ((currentLine = reads.readLine()) != null) {
                        int length = n.length() + 4;
                        if (n.equalsIgnoreCase(currentLine.substring(4, length))) System.out.println(currentLine);
                        int lReads = currentLine.length();
                        for (int i = 0; i < lReads; i++) {
                            if (i % 2 == 0) binary.print("0");
                            else binary.print("1");
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
