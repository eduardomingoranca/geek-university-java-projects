package com.geekuniversity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * Nao aceita chaves duplicadas, mas valores sim
 * A classe HashMap implementa a interface Map e
 * trabalha com chave/valor
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Conta> contas = new HashMap<>();

        Cliente cliente1 = new Cliente(24, "Alice Jones", "Rua One, 123");
        Cliente cliente2 = new Cliente(34, "Felicity Marston", "Rua Two, 124");

        Conta conta1 = new Conta(1, BigDecimal.valueOf(200), BigDecimal.valueOf(300), cliente1);
        Conta conta2 = new Conta(2, BigDecimal.valueOf(400), BigDecimal.valueOf(700), cliente2);

        contas.put("Pessoa Fisica", conta1);
        contas.put("Pessoa Juridica", conta2);
        contas.put("Pessoa fisica", conta2);

        System.out.println(contas.size());

        System.out.println(contas.get("Pessoa Fisica"));
    }
}
