import java.util.Scanner;

/**
 * Um racional eh qualquer numero da forma p/q, sendo p inteiro q inteiro nao nulo. Eh
 * conveniente representar um racional por um registro:
 *  struct racional {
 *      int p, q;
 *  }
 * Vamos convencionar que o campo q de como racional eh estritamente positivo e que o
 * maximo divisor comum dos campos p e q eh 1. Escreva
 *  (a) uma funcao reduz que receba inteiros a e b e devolva o racional que representa a/b;
 *  (b) uma funcao neg que receba um racional x e devolva o racional -x;
 *  (c) uma funcao soma que receba racionais x e y e devolva o racional que representa a
 *      soma de x e y;
 *  (d) uma funcao mult que receba racionais x e y e devolva o racional que representa o
 *      produto de x por y;
 *  (e) uma funcao div que receba racionais x e y e devolva o racional que representa o
 *      quociente de x por y;
 */
public class Desafio70 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("P: ");
        int p = scanner.nextInt();

        System.out.print("Q: ");
        int q = scanner.nextInt();

        if (q < 0) System.out.println("INFORME UM NUMERO POSITIVO MAIOR QUE ZERO!");
        else {
            System.out.println("MDC: " + reduz(p, q));
            System.out.println("NEG: " + neg(p, q));

            System.out.print("X: ");
            int x = scanner.nextInt();

            System.out.print("Y: ");
            int y = scanner.nextInt();

            System.out.println("SOMA: " + soma(p, q, x, y));
            System.out.println("MULT: " + mult(p, q, x, y));
            System.out.println("DIV: " + div(p, q, x, y));
        }
        scanner.close();
    }

    private static String div(int p, int q, int x, int y) {
        return (p * y) + "/" + (q * x);
    }

    private static String mult(int p, int q, int x, int y) {
        return (p * x) + "/" + (q * y);
    }

    private static String soma(int p, int q, int x, int y) {
        int a = 0, b = 0, mmc;
        if (q != y) {
            if (y < q) {
                for (int i = y; i > 0; i--) {
                    if (y % i == 0 && q % i == 0) {
                        a = y / i;
                        b = q / i;
                        break;
                    }
                }
            } else {
                for (int i = q; i > 0; i--) {
                    if (y % i == 0 && q % i == 0) {
                        a = y / i;
                        b = q / i;
                        break;
                    }
                }
            }
            mmc = a * b;
            return (mmc / q * p) + (mmc / y * x) + "/" + mmc;
        }
        return p + x + "/" + q;
    }

    private static String neg(int p, int q) {
        return p * -1 + "/" + q * -1;
    }

    private static String reduz(int p, int q) {
        int a = 0, b = 0;
        if (p < q) {
            for (int i = p; i > 0; i--) {
                if (p % i == 0 && q % i == 0) {
                    a = p / i;
                    b = q / i;
                    break;
                }
            }
        } else {
            for (int i = q; i > 0; i--) {
                if (p % i == 0 && q % i == 0) {
                    a = p / i;
                    b = q / i;
                    break;
                }
            }
        }
        return a + "/" + b;
    }

}