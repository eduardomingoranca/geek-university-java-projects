/**
 * Para que serve o modificador synchronized? Em que situacoes ele deve ser usado? Por que
 * nao usar em todos os metodos do programa?
 * RESPOSTA: A finalidade do synchronized eh evitar que tenha problemas com estados indeterminados
 * em um programa. Suponha que tivesse um metodo para remover elementos do ArrayList boxes. Se esse
 * metodo nao fosse synchronized, poderia ocorrer de ter duas Threads tentando remover o mesmo
 * objeto do ArrayList, o que provocaria problemas inesperados.
 */
public class Desafio13 {

    public static void main(String[] args) {
        Thread thread = new Thread(numerosPrimos());
        thread.start();
    }

    private synchronized static String numerosPrimos() {
        String primo = "";
        for (int i = 0; i <= 20; i++) {
            if (numeroPrimo(i)) {
                primo = i + " ";
                System.out.print(primo);
            }
        }

        return primo;
    }

    private static boolean numeroPrimo(int i) {
        if (i == 1 || i == 0) return false;

        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) return false;
        }

        return true;
    }

}
