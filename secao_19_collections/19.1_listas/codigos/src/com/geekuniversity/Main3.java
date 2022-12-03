package com.geekuniversity;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new Cliente(18, "Mary Wheeler", "Rua One,122");
        Cliente cliente2 = new Cliente(32, "Felicity Hensler", "Rua Two,124");
        Cliente cliente3 = new Cliente(45, "Alice Jones", "Rua One,123");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        Collections.sort(clientes);

        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }

    }
}
