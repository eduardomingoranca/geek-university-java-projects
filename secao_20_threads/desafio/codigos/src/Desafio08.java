/**
 * O exercicio requer alguma forma de sincronismo entre threads? Ilustre uma
 * situacao em que sincronismo eh necessario quando se trabalha com threads.
 * Quais os mecanismos existente em java para se realizar sincronia entre threads..
 */
public class Desafio08 {

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
