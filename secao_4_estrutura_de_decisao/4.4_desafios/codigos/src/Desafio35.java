import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

/**
 * Leia uma data e determine se ela eh valida. Ou seja, verifique se o mes esta entre 1 e 12,
 * e se o dia existe naquele mes. Note que Fevereiro tem 29 dias em anos bissextos, e 28
 * dias em anos nao bissextos.
 */
public class Desafio35 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe uma data (dd/MM/yyyy): ");
            String data = scanner.nextLine();

            DateTimeFormatter formatter = ofPattern("d/MM/yyyy");
            LocalDate localDate = parse(data, formatter);

            System.out.println(formatter.format(localDate));
        } catch (DateTimeParseException e) {
            throw new Exception("data invalida!");
        }

        scanner.close();
    }
}
