import java.util.Scanner;

/**
 * Faca uma funcao que receba 3 numeros inteiros como parametro, representando horas,
 * minutos e segundos, e os converta em segundos.
 */
public class Desafio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe as horas: ");
        int horas = scanner.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Informe os segundos: ");
        int segundos = scanner.nextInt();

        if (horas < 0 || minutos < 0 || segundos < 0) System.out.println("VALOR INVALIDO!");
        else System.out.println(" TOTAL DE SEGUNDOS: " + converterSegundos(horas, minutos, segundos));

        scanner.close();
    }

    private static int converterSegundos(int horas, int minutos, int segundos) {
        return 3600 * horas + 60 * minutos + segundos;
    }

}
