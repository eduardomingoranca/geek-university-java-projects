import java.util.Scanner;

/**
 * Ler dois conjuntos de numeros reais, armazenando-os em vetores e calcular o produto
 * escalar entre eles. Os conjuntos tem 5 elementos cada. Imprimir os dois conjuntos e
 * o produto escalar, sendo que o produto escalar eh dado por: x1 * y1 + x2 * y2 + ...
 * + xn * yn.
 */
public class Desafio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] x = new double[5];
        double[] y = new double[5];
        double[] escalar = new double[y.length];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            x[i] = scanner.nextDouble();
        }

        for (int i = 0; i < y.length; i++) {
            System.out.print("Informe o [" + (i + 1) + "] numero: ");
            y[i] = scanner.nextDouble();
        }

        System.out.println("============================");
        System.out.println("|     PRODUTO ESCALAR      |");
        System.out.println("============================");
        for (int i = 0; i < escalar.length; i++)
            escalar[i] += x[i] * y[i];

        for (double e: escalar) System.out.print(" " + e);

        scanner.close();
    }

}
