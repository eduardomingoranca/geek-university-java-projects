import java.time.Duration;
import java.util.Scanner;

import static java.time.Duration.ofSeconds;

/**
 * Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos.
 */
public class Desafio48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero inteiro em segundos: ");
        int segundos = scanner.nextInt();

        Duration horario = ofSeconds(segundos);

        int horas = horario.toHoursPart();
        int minutos = horario.toMinutesPart();
        int seg = horario.toSecondsPart();

        System.out.println(horas + ":" + minutos + ":" + seg);

        scanner.close();
    }
}
