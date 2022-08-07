import java.util.Scanner;

/**
   As tarifas de certo parque de estacionamento sao as seguintes:
       * 1a e 2a hora - R$ 1.00 cada
       * 3a e 4a hora - R$ 1.40 cada
       * 5a hora e seguintes - R$ 2.00 cada
  O numero de horas a pagar eh sempre inteiro e arredondado por excesso. Deste modo,
  quem estacionar durante 61 minutos pagara por duas horas, que eh o mesmo que pagaria
  se tivesse permanecido 120 minutos. Os momentos de chegada ao parque e partida
  deste sao apresentados na forma de pares de inteiros, representando horas e minutos.
  Por exemplo, o par 12 50 representara "dez para a uma da tarde". Pretende-se criar um
  programa que, lidos pelo teclado os momentos de chegada e de partida, escreva na tela
  o preco cobrado pelo estacionamento. Admite-se que a chegada e a partida se dao com
  intervalo nao superior a 24 horas. Portanto, se uma dada hora de chegada for superior
  a da partida, isso nao eh uma situacao de erro, antes significara que a partida ocorreu
  no dia seguinte ao da chegada.
 */
public class Desafio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora e minuto de entrada: ");
        double horaEntrada = scanner.nextDouble();
        double minutoEntrada = scanner.nextDouble();

        System.out.print("Informe a hora e minuto de saida: ");
        double horaSaida = scanner.nextDouble();
        double minutoSaida = scanner.nextDouble();

        double horaFinal = (horaEntrada > horaSaida) ? (horaSaida + 24) - horaEntrada : horaSaida - horaEntrada;
        double minutoFinal = (minutoEntrada > minutoSaida) ? (minutoSaida + 60) - minutoEntrada : minutoSaida - minutoEntrada;

        System.out.println("A permanencia no estacionamento foi de: " + (int) horaFinal + " horas e " + (int) minutoFinal + " minutos. ");

        double tempoMinutos = horaFinal * 60 + minutoFinal;
        double preco;

        if (tempoMinutos >= 1 && tempoMinutos <= 60) {
            preco = 1.0;
            System.out.println("O valor a ser pago sera de R$ " + preco);
        } else if (tempoMinutos <= 120) {
            preco = 2.0;
            System.out.println("O valor a ser pago sera de R$ " + preco);
        } else if (tempoMinutos <= 180) {
            preco = 4.2;
            System.out.println("O valor a ser pago sera de R$ " + preco);
        } else if (tempoMinutos <= 240) {
            preco = 5.6;
            System.out.println("O valor a ser pago sera de R$ " + preco);
        } else if (tempoMinutos > 240) {
            preco = horaFinal * 2.0;
            System.out.println("O valor a ser pago sera de R$ " + preco);
        } else
            System.out.println("Tempo de permanencia minimo, nao sera necessario pagar!");

        scanner.close();
    }
}
