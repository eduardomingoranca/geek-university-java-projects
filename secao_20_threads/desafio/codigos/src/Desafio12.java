/**
 * Qual a diferenca do efeito produzido pelos programas abaixo? Qual deles eh mais eficiente,
 * assumindo que o computador tem mais de um processador?
 */
public class Desafio12 {

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(numerosPrimos());
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(numerosPrimos());
            threads[i].start();
            threads[i].join();
        }

    }

    private static String numerosPrimos() {
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
