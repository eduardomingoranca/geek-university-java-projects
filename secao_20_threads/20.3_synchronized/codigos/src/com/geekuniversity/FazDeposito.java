package com.geekuniversity;

public class FazDeposito implements Runnable {
    private final Conta conta;

    public FazDeposito(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        this.conta.depositar(100.0);
    }
}
