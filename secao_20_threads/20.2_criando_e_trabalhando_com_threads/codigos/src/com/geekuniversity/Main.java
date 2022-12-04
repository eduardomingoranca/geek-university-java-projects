package com.geekuniversity;

/**
 * Simulacao da geracao de relatorio + barra de tarefa
 * sem a utilizacao de threads
 */
public class Main {

    public static void main(String[] args) {
        BarraProgresso barra = new BarraProgresso();
        barra.executa();

        GeraRelatorio relatorio = new GeraRelatorio();
        relatorio.executa();
    }
}
