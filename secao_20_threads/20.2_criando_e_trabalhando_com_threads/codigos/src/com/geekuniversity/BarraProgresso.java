package com.geekuniversity;

/**
 * Para executar metodos em paralelo, nossa classe
 * deve implementar a interface Runnable, e o metodo
 * que precisar ser executado em paralelo deve ser
 * executado dentro do metodo run
 */
public class BarraProgresso implements Runnable {

    @Override
    public void run() {
        // For 0 ate mil
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " - Barra de progresso...aguarde");
        }
    }

    public void executa() {
        // For 0 ate mil
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " - Barra de progresso...aguarde");
        }
    }
}
