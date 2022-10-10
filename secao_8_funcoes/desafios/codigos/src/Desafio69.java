import java.util.Scanner;

/**
 * Faca um programa que faca operacoes simples de fracoes:
 *  > Crie e leia duas fracoes p e q, compostas por numerador e denominador.
 *  > Encontre o maximo divisor comum entre o numerador e o denominador, e simplifique
 *    as fracoes.
 *  > Apresente a soma, a subtracao, o produto e o quociente entre as fracoes lidas.
 *  Obs: Cria uma funcao para cada item.
 */
public class Desafio69 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o numerador inteiro: ");
        int p = scanner.nextInt();

        System.out.print("Informe o denominador inteiro: ");
        int q = scanner.nextInt();

        System.out.print("Informe outro numerador inteiro: ");
        int p1 = scanner.nextInt();

        System.out.print("Informe outro denominador inteiro: ");
        int q1 = scanner.nextInt();

        System.out.println("QUOCIENTE: " + quocienteFracao(p, q, p1, q1));
        System.out.println("PRODUTO: " + produtoFracao(p, q, p1, q1));
        System.out.println("SUBTRACAO: " + subtracaoFracao(p, q, p1, q1));
        System.out.println("SOMA: " + somaFracao(p, q, p1, q1));
        System.out.println("MDC: " + maximoDivisorComum(p, q));
        System.out.println("MDC2: " + maximoDivisorComum(p1, q1));

        scanner.close();
    }

    private static String quocienteFracao(int p, int q, int p1, int q1) {
        return (p * q1) + "/" + (q * p1);
    }

    private static String produtoFracao(int p, int q, int p1, int q1) {
        return (p * p1) + "/" + (q * q1);
    }

    private static String subtracaoFracao(int p, int q, int p1, int q1) {
        int a = 0, b = 0, subtracao, mmc;
        if (q != q1) {
            if (q1 < q) {
                for (int i = q1; i > 0; i--) {
                    if (q1 % i == 0 && q % i == 0) {
                        a = q1 / i;
                        b = q / i;
                        break;
                    }
                }
            } else {
                for (int i = q; i > 0; i--) {
                    if (q1 % i == 0 && q % i == 0) {
                        a = q1 / i;
                        b = q / i;
                        break;
                    }
                }
            }
            mmc = a * b;
            subtracao = ((mmc / q * p) - (mmc / q1 * p1));

            return subtracao + "/" + mmc;
        }

        return (p - p1) + "/" + q;
    }

    private static String somaFracao(int p, int q, int p1, int q1) {
        int a = q * q1;
        int b = (a / q * p) + (a / q1 * p1);
        return b + "/" + a;
    }

    private static String maximoDivisorComum(int p, int q) {
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
