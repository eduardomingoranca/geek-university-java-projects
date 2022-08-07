import java.util.List;
import java.util.Scanner;

import static java.time.LocalDate.now;

/**
 * Leia uma data de nascimento de uma pessoa fornecida atraves de tres numeros inteiros:
 * Dia, Mes e Ano. Teste a validade desta data para saber se esta eh uma data valida. Teste
 * se o dia fornecido eh um dia valido: dia > 0, dia <= 28 para o mes de fevereiro (29 de o
 * ano for bissexto), dia <= 30 em abril, junho, setembro e novembro, dia <= 31 nos outros
 * meses. Teste a validade do mes: mes > 0 e mes < 13. Teste a validade do ano: ano <= ano
 * atual (use uma constante definida com o valor igual a 2008). Imprimir: "data valida" ou
 * "data invalida" no final da execucao do programa.
 */
public class Desafio38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a data de nascimento (dd/MM/yyyy): ");
        String dataNascimento = scanner.nextLine();

        List<String> data = List.of(dataNascimento.split("/"));

        if (Integer.parseInt(data.get(2)) <= now().getYear()) { // ano
            if (Integer.parseInt(data.get(2)) % 400 == 0 || Integer.parseInt(data.get(2)) % 4 == 0
                    && Integer.parseInt(data.get(2)) % 100 != 0) { // ano bissexto
                if (Integer.parseInt(data.get(0)) > 0 &&  Integer.parseInt(data.get(0)) <= 29)  // dia
                    System.out.println((Integer.parseInt(data.get(1)) > 0   // mes
                            && Integer.parseInt(data.get(1)) < 13) ? "data valida!" : "data invalida!");
                else
                    System.out.println("data invalida!");
            } else { // ano nao bissexto
                if (Integer.parseInt(data.get(0)) > 0 &&  Integer.parseInt(data.get(0)) < 29)  // dia
                    System.out.println((Integer.parseInt(data.get(1)) > 0 // mes
                            && Integer.parseInt(data.get(1)) < 13) ? "data valida!" : "data invalida!");
                else
                    System.out.println("data invalida!");
            }
        } else {
            System.out.println("data invalida!"); // ano
        }

        scanner.close();
    }
}
