import java.util.Scanner;

/**
 * Considerando a estrutura:
 *  struct Ponto {
 *      int x;
 *      int y;
 *  }
 *  para representar um ponto em uma grade 2D, implemente uma funcao que indique se um
 *  ponto p esta localizado dentro ou fora de um retangulo. O retangulo eh definido por seus
 *  vertices inferior esquerdo v1 e superior direito v2. A funcao deve retornar 1 caso o ponto
 *  esteja localizado dentro do retangulo e 0 caso contrario. Essa funcao deve obedecer ao
 *  prototipo:
 *      int dentroRet (struct Ponto * v1, struct Ponto * v2, struct Ponto * p);
 */
public class Desafio71 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("X: ");
        double x = scanner.nextDouble();

        System.out.print("Y: ");
        double y = scanner.nextDouble();

        System.out.print("V1: ");
        double v1 = scanner.nextDouble();

        System.out.print("V2: ");
        double v2 = scanner.nextDouble();

        System.out.print("P: ");
        double p = scanner.nextDouble();

        System.out.println(dentroRet(v1, v2, p, x, y));

        scanner.close();
    }

    private static int dentroRet(double v1, double v2, double p, double x, double y) {
        double a = ((x * v1) * (v2 * y)) / 2;

        int retorno = 0;
        if (a == p) retorno = 1;

        return retorno;
    }

}