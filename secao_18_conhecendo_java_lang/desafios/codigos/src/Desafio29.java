import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 * Codifique um programa que manipule um arquivo contendo registros descritos pelos
 * seguintes campos: codigo_vendedor, nome_vendedor, valor_da_venda e mes.
 * A manipulacao do arquivo em questao eh feita atraves da execucao das operacoes
 * disponibilizadas pelo seguinte menu:
 *      * Criar o arquivo de dados;
 *      * Incluir um determinado registro no arquivo;
 *      * Excluir um determinado vendedor no arquivo;
 *      * Alterar o valor de uma venda no arquivo;
 *      * Imprimir os registros na saida padrao;
 *      * Excluir o arquivo de dados;
 *      * Finalizar o programa;
 * Os registros devem estar ordenados no arquivo, de forma crescente, de acordo com as
 * informacoes contidas nos campos codigo_vendedor e mes. Nao deve existir mais de um
 * registro no arquivo com mesmos valores nos campos codigo_vendedor e mes.
 */
public class Desafio29 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String nomeArquivo = null;

            System.out.println("==================================================");
            System.out.println("| [A] CRIAR O ARQUIVO DE DADOS                   |");
            System.out.println("| [B] INCLUIR UM DETERMINADO REGISTRO NO ARQUIVO |");
            System.out.println("| [C] EXCLUIR UM DETERMINADO VENDEDOR NO ARQUIVO |");
            System.out.println("| [D] ALTERAR O VALOR DE UMA VENDA NO ARQUIVO    |");
            System.out.println("| [E] IMPRIMIR OS REGISTROS NA SAIDA PADRAO      |");
            System.out.println("| [F] EXCLUIR O ARQUIVO DE DADOS                 |");
            System.out.println("| [G] FINALIZAR O PROGRAMA                       |");
            System.out.println("==================================================");

            System.out.print("Informe uma opcao: ");
            String opcao = scanner.nextLine();

            while (!opcao.equalsIgnoreCase("g")) {
                if (opcao.equalsIgnoreCase("a")) {
                    System.out.print("Informe o nome do arquivo que deseja criar: ");
                    nomeArquivo = scanner.nextLine();
                    new PrintStream(new FileOutputStream(nomeArquivo.concat(".txt"), true));
                } else if (opcao.equalsIgnoreCase("b")) {
                    assert nomeArquivo != null;
                    PrintStream writer = new PrintStream(new FileOutputStream(nomeArquivo.concat(".txt"), true));

                    System.out.print("Informe o codigo do vendedor: ");
                    int codigoVendedor = parseInt(scanner.nextLine());

                    System.out.print("Informe o nome do vendedor: ");
                    String nomeVendedor = scanner.nextLine();

                    System.out.print("Informe o numero do mes da venda: ");
                    int numeroMes = parseInt(scanner.nextLine());

                    System.out.print("Informe o valor da venda R$ ");
                    double valorVenda = parseDouble(scanner.nextLine());

                    writer.println(codigoVendedor + " " + nomeVendedor + " " + numeroMes + " " + BigDecimal.valueOf(valorVenda));
                } else if (opcao.equalsIgnoreCase("c")) {
                    assert nomeArquivo != null;
                    BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo.concat(".txt")));
                    PrintStream printStream = new PrintStream(new FileOutputStream(nomeArquivo.concat("Output.txt"), true));

                    System.out.print("Informe o vendedor que deseja excluir: ");
                    String lineToRemove = scanner.nextLine();

                    String currentLine;

                    while((currentLine = reader.readLine()) != null) {
                        int length = lineToRemove.length() + 4;
                        if(currentLine.substring(4, length).trim().equalsIgnoreCase(lineToRemove)) continue;
                        printStream.print(currentLine + System.getProperty("line.separator"));
                    }

                    printStream.close();
                } else if (opcao.equalsIgnoreCase("d")) {
                    assert nomeArquivo != null;
                    BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo.concat(".txt")));
                    PrintStream printStream = new PrintStream(new FileOutputStream(nomeArquivo.concat("Out.txt"), true));

                    String currentLine;

                    while ((currentLine = reader.readLine()) != null) {
                        System.out.print("Informe um novo valor R$ ");
                        double valor = Double.parseDouble(scanner.nextLine());

                        String newValue = currentLine.replace(currentLine.substring(18), String.valueOf(valor));
                        printStream.println(newValue);
                    }
                } else if (opcao.equalsIgnoreCase("e")) {
                    BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo.concat(".txt")));

                    String currentLine;

                    while ((currentLine = reader.readLine()) != null) {
                        System.out.println(currentLine);
                    }

                } else if (opcao.equalsIgnoreCase("f")) {
                    assert nomeArquivo != null;
                    File file = new File(nomeArquivo.concat(".txt"));
                    file.delete();
                    System.out.println("ARQUIVO EXCLUIDO COM SUCESSO!");
                }

                System.out.println("==================================================");
                System.out.println("| [A] CRIAR O ARQUIVO DE DADOS                   |");
                System.out.println("| [B] INCLUIR UM DETERMINADO REGISTRO NO ARQUIVO |");
                System.out.println("| [C] EXCLUIR UM DETERMINADO VENDEDOR NO ARQUIVO |");
                System.out.println("| [D] ALTERAR O VALOR DE UMA VENDA NO ARQUIVO    |");
                System.out.println("| [E] IMPRIMIR OS REGISTROS NA SAIDA PADRAO      |");
                System.out.println("| [F] EXCLUIR O ARQUIVO DE DADOS                 |");
                System.out.println("| [G] FINALIZAR O PROGRAMA                       |");
                System.out.println("==================================================");

                System.out.print("Informe uma opcao: ");
                opcao = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

