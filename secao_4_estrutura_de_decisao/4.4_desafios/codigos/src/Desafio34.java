import java.util.Scanner;

/**
 * Leia a nota e o numero de faltas de um aluno, e escreva seu conceito. De acordo com a
 * tabela abaixo, quando o aluno tem mais de 20 faltas acorre uma reducao de conceito.
 *      | NOTA         | CONCEITO (ATE 20 FALTAS) | CONCEITO (MAIS DE 20 FALTAS) |
 *      | 9.0 ate 10.0 |           A              |                B             |
 *      | 7.5 ate 8.9  |           B              |                C             |
 *      | 5.0 ate 7.4  |           C              |                D             |
 *      | 4.0 ate 4.9  |           D              |                E             |
 *      | 0.0 ate 3.9  |           E              |                E             |
 *
 */
public class Desafio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota do aluno: ");
        double nota = scanner.nextDouble();

        System.out.print("Informe a quantidade de faltas do aluno: ");
        int falta = scanner.nextInt();

        if (nota >= 9.0 && nota <= 10.0) {
            if (falta <= 20)
                System.out.println("A");
            else System.out.println("B");
        } else if (nota >= 7.5 && nota <= 8.9) {
            if (falta <= 20)
                System.out.println("B");
            else System.out.println("C");
        } else if (nota >= 5.0 && nota <= 7.4) {
            if (falta <= 20)
                System.out.println("C");
            else System.out.println("D");
        } else if (nota >= 4.0 && nota <= 4.9) {
            if (falta <= 20)
                System.out.println("D");
            else System.out.println("E");
        } else if (nota >= 0.0 && nota <= 3.9) {
            if (falta <= 20)
                System.out.println("E");
            else System.out.println("E");
        } else System.out.println("nota invalida!");

        scanner.close();
    }
}
