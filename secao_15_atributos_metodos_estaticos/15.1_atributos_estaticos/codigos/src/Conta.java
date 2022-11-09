public class Conta {
    private final int numero;
    private final String cliente;
    public static int contador = 1;

    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador += 1;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

}
