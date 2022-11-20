import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.lowestOneBit;
import static java.lang.Integer.parseInt;

/**
 * Crie um programa que declare uma classe para o cadastro de alunos.
 * (a) Deverao ser armazenados, para cada aluno: matricula, sobrenome (apenas um), e
 *     ano de nascimento.
 * (b) Ao inicio do programa, o usuario devera informar o numero de alunos que serao
 *     armazenados.
 * (c) O programa devera pedir ao usuario que entre com as informacoes dos alunos.
 * (d) Em seguida, essas informacoes deverao ser gravadas em um arquivo.
 */
public class Desafio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            PrintStream writer = new PrintStream(new FileOutputStream("alunos.txt", true));

            System.out.print("Informe a quantidade de alunos que serao cadastrados: ");
            int quantidade = parseInt(scanner.nextLine());

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Informe o numero da matricula do " + (i+1) + " aluno: " );
                int numeroMatricula = parseInt(scanner.nextLine());

                System.out.print("Informe o sobrenome do " + (i+1) + " aluno: ");
                String sobrenome = scanner.nextLine();

                System.out.print("Informe o ano de nascimento do " + (i+1) + " aluno: ");
                int anoNascimento = parseInt(scanner.nextLine());

                writer.println(numeroMatricula + " " + sobrenome + " " + anoNascimento);
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado!");
        }

        scanner.close();
    }
}

