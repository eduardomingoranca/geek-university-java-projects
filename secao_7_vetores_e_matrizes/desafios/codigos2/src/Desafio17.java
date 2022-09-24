import java.util.Scanner;

/**
 * Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva
 * o numero de alunos cuja pior nota foi na prova 1, o numero de alunos cuja pior nota
 * foi na prova 2, e o numero de alunos cuja pior nota foi na prova 3. Em caso de empate
 * das piores notas de um aluno, o criterio de desempate eh arbitrario, mas o aluno deve
 * ser contabilizado apenas uma vez.
 */
public class Desafio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[10][3];
        int piorNota1 = 0, piorNota2 = 0, piorNota3 = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("NOTAS [" + i + "][" + j + "]: ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (notas[i][0] < 7) piorNota1++;
            if (notas[i][1] < 7) piorNota2++;
            if (notas[i][2] < 7) piorNota3++;
        }

        System.out.println("TOTAL PIOR NOTA [1]: " + piorNota1);
        System.out.println("TOTAL PIOR NOTA [2]: " + piorNota2);
        System.out.println("TOTAL PIOR NOTA [3]: " + piorNota3);

        scanner.close();
    }
}
