import java.util.Scanner;

/**
 * Dados tres valores, A, B, C, verificar se eles podem ser valores dos lados de um triangulo
 * e, se forem, se eh um triangulo escaleno, equilatero ou isoscele, considerando os seguintes
 * conceitos:
 *      * O comprimento de cada lado de um triangulo eh menor do que a soma dos outros
 *        dois lados.
 *      * Chama-se equilatero o triangulo que tem tres lados iguais.
 *      * Denominam-se isosceles o triangulo que tem o comprimento de dois lados iguais.
 *      * Recebe o nome de escaleno o triangulo que tem os tres lados diferentes.
 */
public class Desafio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        System.out.print("C: ");
        double c = scanner.nextDouble();

        if ((b - c) > a && a > (b + c))
            System.out.println("NAO EH UM TRIANGULO!");
        else if ((a - c) > b && b > (a + b))
            System.out.println("NAO EH UM TRIANGULO!");
        else if ((a - b) > c && c > (a + b))
            System.out.println("NAO EH UM TRIANGULO!");
        else if (a == b && b == c)
            System.out.println("TRIANGULO EQUILATERO!");
        else if (a == b || a == c || b == c)
            System.out.println("TRIANGULO ISOSCELES!");
        else System.out.println("ESCALENO");

        scanner.close();
    }
}
