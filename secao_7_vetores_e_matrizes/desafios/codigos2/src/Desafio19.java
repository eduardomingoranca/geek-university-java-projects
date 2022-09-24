import java.util.Scanner;

/**
  Faca um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes
  informacoes sobre alunos de uma disciplina, sendo todas as informacoes do tipo inteiro:
       >> Primeira coluna: numero de matricula (use um inteiro)
       >> Segunda coluna: media das provas
       >> Terceira coluna: media dos trabalhos
       >> Quarta coluna: nota final
  Elabore um programa que:
  (a) Leia as tres primeiras informacoes de cada aluno
  (b) Calcule a nota final como sendo a soma da media das provas e da media dos
      trabalhos
  (c) Imprima a matricula do aluno que obteve a maior nota final (assuma que so existe
      uma maior nota)
  (d) Imprima a media aritmetica das notas finais.
 */
public class Desafio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] boletimEscolar = new double[5][4];
        double soma = 0;
        double maior = boletimEscolar[0][3];
        int b = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("INFORME O NUMERO DA MATRICULA DO [" + i + "] ALUNO: ");
            boletimEscolar[i][0] = scanner.nextDouble();

            System.out.print("INFORME A MEDIA DAS PROVAS DO [" + i + "] ALUNO: ");
            boletimEscolar[i][1] = scanner.nextDouble();

            System.out.print("INFORME A MEDIA DOS TRABALHOS DO [" + i + "] ALUNO: ");
            boletimEscolar[i][2] = scanner.nextDouble();

            boletimEscolar[i][3] = boletimEscolar[i][1] + boletimEscolar[i][2];
            soma += boletimEscolar[i][3];
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + boletimEscolar[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            if (maior < boletimEscolar[i][3]) {
                maior = boletimEscolar[i][3];
                b = i;
            }
        }

        System.out.println();
        System.out.println(" MATRICULA DO ALUNO DA MAIOR NOTA: " + boletimEscolar[b][0]);
        System.out.println(" MEDIA ARITMETICA: " + soma/5.0);

        scanner.close();
    }
}
