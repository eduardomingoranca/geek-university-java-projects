import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

/**
 * Elabore uma funcao que receba tres notas de um aluno como parametros e uma letra.
 * Se a letra for A, a funcao devera calcular a media aritmetica das notas do aluno;
 * se for P, devera calcular a media ponderada, com pesos 5, 3 e 2.
 */
public class Desafio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe a [" + (i+1) + "] nota: ");
            double nota = parseDouble(scanner.nextLine());
            notas.add(nota);
        }

        System.out.print("Informe uma letra: ");
        String letra = scanner.nextLine();

        if (!letra.equals("A") && !letra.equals("B")) System.out.println("LETRA INVALIDA!");
        else System.out.println(medias(notas.get(0), notas.get(1), notas.get(2), letra));

        scanner.close();
    }

    private static String medias(double nota1, double nota2, double nota3, String letra) {
        if (letra.equals("A")) return "MEDIA ARITMETICA: " + (nota1 + nota2 + nota3) / 3.0;
        return "MEDIA PONDERADA: " + (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10.0;
    }

}
