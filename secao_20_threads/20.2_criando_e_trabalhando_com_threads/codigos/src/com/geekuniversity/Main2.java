package com.geekuniversity;

/**
 * Simulacao da geracao de relatorio + barra de tarefa
 * com a utilizacao de threads
 */
public class Main2 {

    public static void main(String[] args) {
        BarraProgresso barra = new BarraProgresso();
        Thread thread1 = new Thread(barra);
        thread1.start();

        GeraRelatorio relatorio = new GeraRelatorio();
        Thread thread2 = new Thread(relatorio);
        thread2.start();
    }
}
