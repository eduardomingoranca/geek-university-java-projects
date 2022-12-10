/**
 * Faca um programa que imprima os numeros primos existentes entre 0 e 99999.
 * UTILIZE THREADS. Dica: para cada faixa de mil valores cre um thread e dispare
 * o processo para cada um delas.
 */
public class Desafio07 {

    public static void main(String[] args) {
        Thread thread = new Thread(numerosPrimos());
        thread.start();
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
