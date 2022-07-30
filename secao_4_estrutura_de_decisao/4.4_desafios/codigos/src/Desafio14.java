import java.util.Scanner;

/**
 * A nota final de um estudante eh calculada a partir de tres notas atribuidas entre o intervalo
 * de 0 ate 10, respectivamente, a um trabalho de laboratorio, a uma avaliacao semestral
 * e a um exame final. A media das tres notas mencionadas anteriormente obedece aos
 * pesos: Trabalho de Laboratorio: 2, Avaliacao Semestral: 3, Exame Final: 5. De acordo
 * com o resultado, mostre na tela se o aluno esta reprovado (media entre 0 e 2,9), de
 * recuperacao (entre 3 e 4,9) ou se foi aprovado. Faca todas as verificacoes necessarias.
 */
public class Desafio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota do trabalho de laboratorio: ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.print("Informe a nota da avaliacao semestral: ");
        double notaAvaliacao = scanner.nextDouble();

        System.out.print("Informe a nota do exame final: ");
        double notaExame = scanner.nextDouble();

        if (notaLaboratorio < 0.0 || notaLaboratorio > 10.0 || notaAvaliacao < 0.0 || notaAvaliacao > 10.0 ||
                notaExame < 0.0 || notaExame > 10.0) {
            System.out.println("nota invalida!");
        } else {
            double media = ((notaLaboratorio * 2.0) + (notaAvaliacao * 3.0) + (notaExame * 5.0)) / 10.0;

            if (media >= 0.0 && media <= 2.9)
                System.out.println("reprovado");
            else if (media >= 3.0 && media <= 4.9)
                System.out.println("recuperacao");
            else
                System.out.println("aprovado");
        }

        scanner.close();
    }
}
