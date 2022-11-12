public class Conta {
    private int numero;
    private Double saldo;
    private Double limite;
    private Cliente cliente;

    public Conta(int numero, Double saldo, Double limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public Conta() { }

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

    /**
     * Metodo para realizar deposito
     *
     * @param valor a ser depositado
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * Metodo getter do atributo Saldo
     *
     * @return a soma do saldo + limite
     */
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

    @Override
    public String toString() {
        return "O saldo da conta eh R$ " + this.getSaldo();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Conta verificar)) return false;
        else return verificar.getSaldo() == this.getSaldo();
    }
}
