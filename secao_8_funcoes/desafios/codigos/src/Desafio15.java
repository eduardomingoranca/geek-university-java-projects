import java.util.Scanner;

/**
 * Crie um programa que receba tres valores (obrigatoriamente maiores que zero), representando
 * as medidas dos tres lados de um triangulo. Elabore funcoes para:
 *      (a) Determinar se eles lados formam um triangulo, sabendo que:
 *          >> O comprimento de cada lado de um triangulo eh menor do que a soma dos outros
 *             dois lados.
 *      (b) Determinar e mostrar o tipo de triangulo, caso as medidas formem um triangulo.
 *          Sendo que:
 *              >> Chama-se equilatero o triangulo que tem tres lados iguais.
 *              >> Denominam-se isosceles o triangulo que tem o comprimento de dois lados
 *                 iguais.
 *              >> Recebe o nome de escaleno o triangulo que tem os tres lados diferentes.
 */
public class Desafio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("|    TRIANGULO      |");
        System.out.println("=====================");

        System.out.print("L1: ");
        double l1 = scanner.nextDouble();

        System.out.print("L2: ");
        double l2 = scanner.nextDouble();

        System.out.print("L3: ");
        double l3 = scanner.nextDouble();

        if (verificaTriangulo(l1, l2, l3)) System.out.println(tipoTriangulo(l1, l2, l3));
        else System.out.println("NAO EH UM TRIANGULO!");

        scanner.close();
    }

    private static String tipoTriangulo(double l1, double l2, double l3) {
        if (l1 == l2 && l2 == l3) return "TRIANGULO EQUILATERO!";
        else if (l1 == l2 || l2 == l3 || l1 == l3) return "TRIANGULO ISOSCELES!";
        return "TRIANGULO ESCALENO!";
    }

    private static boolean verificaTriangulo(double l1, double l2, double l3) {
        return l1 + l2 > l3 || l1 + l3 > l2 || l2 + l3 > l1;
    }

}
