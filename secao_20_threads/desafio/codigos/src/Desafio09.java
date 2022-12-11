/**
 * Quais sao os estados de uma thread? O que significa uma thread dormindo? uma
 * thread executando? uma thread executavel?
 * RESPOSTA: A execucao de uma thread pode passar por quatro estados: novo, executavel,
 * bloqueado e encerrado. A thread dormindo eh quando, quando for desativada.  A thread
 * esta no estado de executavel, quando for ativada. O processo de ativação eh originado
 * pelo metodo start(). Eh importante frisar que uma thread executavel nao esta necessariamente
 * sendo executada, pois quem determina o tempo de sua execucao eh a JVM ou o S.O.
 */
public class Desafio09 {

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
