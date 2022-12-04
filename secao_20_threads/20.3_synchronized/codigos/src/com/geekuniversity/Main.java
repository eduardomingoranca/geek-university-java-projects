package com.geekuniversity;

/**
 * Thread Nao Sincronizada (Nao eh estavel)
 * Por padrao as threads nao sao sincronizadas. Pode ocorrer problemas
 * de uma thread acessar o valor de um objeto que ainda nao foi atualizado
 * ou ainda as threads executarem depois do valor ja estar impresso.
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(37, "Alice Wheeler", "Rua One, 123");
        Conta conta1 = new Conta(1, 200, 300, cliente1); // saldo 500

        FazDeposito acao = new FazDeposito(conta1);
        Thread thread1 = new Thread(acao);
        Thread thread2 = new Thread(acao);

        thread1.start();
        thread2.start();

        System.out.println(conta1);
    }
}
