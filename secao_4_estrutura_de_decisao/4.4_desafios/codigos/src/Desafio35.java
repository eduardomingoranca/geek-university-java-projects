import java.util.List;
import java.util.Scanner;

import static java.time.LocalDate.now;

/**
 * Leia uma data e determine se ela eh valida. Ou seja, verifique se o mes esta entre 1 e 12,
 * e se o dia existe naquele mes. Note que Fevereiro tem 29 dias em anos bissextos, e 28
 * dias em anos nao bissextos.
 */
public class Desafio35 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma data (dd/MM/yyyy): ");
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
