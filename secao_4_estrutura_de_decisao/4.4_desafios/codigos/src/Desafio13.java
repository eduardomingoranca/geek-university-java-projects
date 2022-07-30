import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Faca um algoritmo que calcule a media ponderada das notas de 3 provas. A primeira e
 * a segunda prova tem peso 1 e a terceira tem peso 2. Ao final, mostrar a media do aluno
 * e indicar se o aluno foi aprovado ou reprovado. A nota para aprovacao deve ser igual ou
 * superior a 60 pontos.
 */
public class Desafio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe a [" + i + "] nota: ");
            double nota = scanner.nextDouble();

            notas.add(nota);
        }

        double mediaPonderada = ((notas.get(0) * 1.0) + (notas.get(1) * 1.0) + (notas.get(2) * 2.0)) / 4.0;

        String aprovacao = (mediaPonderada >= 60.0) ? "aprovado" : "reprovado";

        System.out.println("O aluno foi " + aprovacao);

        scanner.close();
    }
}
