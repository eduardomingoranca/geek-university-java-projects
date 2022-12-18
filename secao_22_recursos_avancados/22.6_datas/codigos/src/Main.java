import java.time.*;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.Month.JANUARY;
import static java.time.Period.between;
import static java.time.format.DateTimeFormatter.ofPattern;

/**
 * Datas
 */
public class Main {

    public static void main(String[] args) {
        LocalDate hoje = now();
        System.out.println(hoje); // Formato ISO (internacional)

        LocalDate anoNovo = of(2024, JANUARY, 1);
        System.out.println(anoNovo); // Formato ISO (internacional)

        int ano = anoNovo.getYear();
        Month mes = anoNovo.getMonth();
        int dia = anoNovo.getDayOfMonth();

        System.out.println("O ano novo sera em " + dia + " de " + mes + " de " + ano);

        Period period = between(hoje, anoNovo);
        System.out.println(period);

        System.out.println("Faltam " + period.getYears() + " anos " + period.getMonths() + " meses e "
                + period.getDays() + " dias para o ano novo.");

        DateTimeFormatter formatter = ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatter));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora); // Formato ISO (internacional)

        DateTimeFormatter formatterHoras = ofPattern("dd/MM/yyyy HH:mm:ss"); // dd/MM/yyyy HH:mm:ss
        System.out.println(agora.format(formatterHoras));

        LocalTime intervalo = LocalTime.of(9, 30);
        System.out.println(intervalo);
    }
}
