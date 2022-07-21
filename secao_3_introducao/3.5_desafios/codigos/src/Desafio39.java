import java.util.Scanner;

/**
 * A importancia de R$ 780.000,00 sera dividida entre tres ganhadores de um concurso.
 * Sendo que da quantia total:
 *      > O primeiro ganhador recebera 46%
 *      > O segundo recebera 32%
 *      > O terceiro recebera o restante
 * Calcule e imprima a quantia ganha por cada um dos ganhadores.
 */
public class Desafio39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double primeiroGanhador = (780000 * 0.46);
        double segundoGanhador = (780000 * 0.32);
        double terceiroGanhador = 780000 - (primeiroGanhador + segundoGanhador);

        System.out.println("A quantia ganha pelo primeiro eh: R$ " + primeiroGanhador);
        System.out.println("A quantia ganha pelo segundo eh: R$ " + segundoGanhador);
        System.out.println("A quantia ganha pelo terceiro eh: R$ " + terceiroGanhador);
        System.out.println("Valor do premio total: R$ " + (primeiroGanhador + segundoGanhador + terceiroGanhador));

        scanner.close();
    }
}
