package com.geekuniversity;

/**
 * Thread Sincronizada
 * O sincronismo ocorre pois durante a execucao do metodo a thread
 * executa um 'lock' (bloqueio) da funcao para que outra thread
 * so possa executa-la pos a finalizacao da thread inicial.
 */
public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        Cliente cliente1 = new Cliente(37, "Alice Wheeler", "Rua One, 123");
        Conta conta1 = new Conta(1, 200, 300, cliente1); // saldo 500

        FazDeposito acao = new FazDeposito(conta1);
        Thread thread1 = new Thread(acao);
        Thread thread2 = new Thread(acao);

        thread1.start(); // 500 + 100 = 600?
        thread2.start(); // 600 + 100 = 700?

        thread1.join(); // avisando que a thread thread1 deve 'se juntar' a um sincronizador
        thread2.join(); // avisando que a thread thread2 deve 'se juntar' a um sincronizador

        System.out.println(conta1);
    }
}
