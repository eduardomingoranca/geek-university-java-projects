package br.com.geekuniversity;

/**
 * Getters e Setters
 * Getter
 *  - eh um metodo publico, que serve para consultar dados;
 *  - a nomenclatura desses metodos eh get_nome_do_atributo()
 */
public class Conta {
    int numero;
    private float saldo;
    private float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    void sacar(float valor) {
        if (valor <= this.saldo) this.saldo -= valor;
        else if (valor <= (this.saldo + this.limite)) {
//            calculando o valor excedente do saque
            // 100 - 200 -> -100
            float temp = this.saldo - valor;
            if (temp < 0) this.saldo = 0;

            temp = this.limite + temp;
            this.limite = temp;
        } else System.out.println("Saldo insuficiente!");
    }

    void depositar(float valor) {
        this.saldo += valor;
    }

    // Metodo getter do atributo saldo
    public float getSaldo() {
        return saldo + limite;
    }

}
