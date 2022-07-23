import java.util.Scanner;

/**
 * Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido proporcionalmente
 * ao valor que cada deu para a realizacao da aposta. Faca um programa que leia quanto cada apostador
 * investiu, o valor do premio, e imprima quanto cada um ganharia do premio com base no valor investido.
 */
public class Desafio52 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do premio: R$ ");
        double premio = scanner.nextDouble();

        System.out.print("Informe o valor investido pelo apostador01: R$ ");
        double apostador01 = scanner.nextDouble();

        System.out.print("Informe o valor investido pelo apostador02: R$ ");
        double apostador02 = scanner.nextDouble();

        System.out.print("Informe o valor investido pelo apostador03: R$ ");
        double apostador03 = scanner.nextDouble();

        double aposta = apostador01 + apostador02 + apostador03;

        double recebe01 = premio * (apostador01 / aposta);
        double recebe02 = premio * (apostador02 / aposta);
        double recebe03 = premio * (apostador03 / aposta);

        System.out.println("O apostador01 recebe R$ " + recebe01);
        System.out.println("O apostador02 recebe R$ " + recebe02);
        System.out.println("O apostador03 recebe R$ " + recebe03);

        scanner.close();
    }
}
