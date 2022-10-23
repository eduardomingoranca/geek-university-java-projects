package br.com.geekuniversity;

/**
 * Encapsulamento
 */
public class Main {

    public static void main(String[] args) {
        Cliente john = new Cliente("John Stewart", "Rua da Paz 45");
        Cliente mary = new Cliente("Mary Kweller", "Rua da Paz 45");

        Conta contaJohn = new Conta(1, 100.0f, 200.0f, john);
        Conta contaMary = new Conta(2, 300.0f, 500.0f, mary);

        System.out.println("Saldo do John (Antes do Saque): " + contaJohn.getSaldo());
        System.out.println("Saldo do Mary: " + contaMary.getSaldo());

        contaJohn.sacar(300);
        System.out.println("Saldo do John (Depois do Saque): " + contaJohn.getSaldo());

    }
}
