import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.time.Duration.ofSeconds;

/**
 * Faca um programa para que leia o horario (hora, minuto e segundo) de inicio e a duracao, em
 * segundos, de uma experiencia biologica. O programa deve resultar com o novo horario
 * (hora, minuto e segundo) do termino da mesma.
 */
public class Desafio49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o horario (hh:mm:ss): ");
        String horario = scanner.next();

        String[] splitHorario = horario.split(":");
        List<String> strings = Arrays.asList(splitHorario);
        int hora = Integer.parseInt(strings.get(0));
        int minuto = Integer.parseInt(strings.get(1));
        int segundo = Integer.parseInt(strings.get(2));

        System.out.print("Informe a duracao da experiencia biologica: ");
        int duracao = scanner.nextInt();

        Duration duration = ofSeconds(duracao);
        int novaHora = hora + duration.toHoursPart();
        int novoMinuto = minuto + duration.toMinutesPart();
        int novoSegundo = segundo + duration.toSecondsPart();

        System.out.println(novaHora + ":" + novoMinuto + ":" + novoSegundo);

        scanner.close();
    }
}
