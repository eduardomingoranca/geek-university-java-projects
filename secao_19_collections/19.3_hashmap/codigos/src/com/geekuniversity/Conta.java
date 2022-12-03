package com.geekuniversity;

import java.math.BigDecimal;

public class Conta {
    private final int numero;
    private final BigDecimal saldo;
    private final BigDecimal limite;
    private final Cliente cliente;

    public Conta(int numero, BigDecimal saldo, BigDecimal limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", cliente=" + cliente +
                '}';
    }
}
