public class Conta {
    private final int numero;
    private Double saldo;
    private Double limite;
    private final Cliente cliente;

    public Conta(int numero, Double saldo, Double limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else if (valor <= (this.saldo + this.limite)) {
            double value = this.saldo - valor;
            if (value < 0.0)
                this.saldo = 0.0;

            value = this.limite + value;
            this.limite = value;
            System.out.println("Saque realizado com sucesso!");
        } else System.out.println("Saldo insuficiente!");
    }

    public void depositar(double value) {
        this.saldo += value;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public int getNumero() {
        return numero;
    }

    public Double getLimite() {
        return limite;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
