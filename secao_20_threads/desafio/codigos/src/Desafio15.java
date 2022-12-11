/**
 * Varios objetos da classe Desafio15 (vide abaixo) sao utilizadas num programa multi-thread. O que ocorre
 * quando outras threads utilizam o codigo abaixo?
 *      (a) Erro de compilacao.
 *      (b) Erro de execucao.
 *      (c) Cada thread obtera um numero unico. [RESPOSTA CORRETA]
 *      (d) Nao se pode garantir que cada thread obtera um numero unico.
 */
public class Desafio15 {

    static private int myCount = 0;

    private static synchronized int nextCount() {
        return ++myCount;
    }

    public static void main(String[] args) {
        int yourNumber = nextCount();

        System.out.println(yourNumber);
    }

}
