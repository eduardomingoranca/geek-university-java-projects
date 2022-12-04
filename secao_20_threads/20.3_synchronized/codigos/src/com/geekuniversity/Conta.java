package com.geekuniversity;

/**
 * Getters e Setters
 * Getter
 * 	- eh um metodo publico, que serve para consultar dados;
 * 	- A nomenclatura desses metodos eh getNome_do_atributo()
 */
public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;

    public Conta(int numero, double saldo, double limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public Conta() {}

    public void sacar(double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso");
        }else if(valor <= (this.saldo + this.limite)){
            //calculando o valor excedente do saque
            //100 - 200 -> -100
            double val_ret = this.saldo - valor;
            if(val_ret < 0) {
                this.saldo = 0;
            }
            //val_ret = this.limite - val_ret
            val_ret = this.limite + val_ret;
            this.limite = val_ret;
            System.out.println("Saque realizado com sucesso");
        }else System.out.println("Saldo insuficiente");
    }

    /**
     * Metodo para realizar deposito
     *
     * @param valor a ser depositado
     */
//    Forma 1
	public void depositar(double valor) {
		synchronized(this) {
			this.saldo = this.saldo + valor;
		}
	}

//    Forma 2
//    public synchronized void depositar(double valor) {
//        this.saldo = this.saldo + valor;
//    }

    /**
     * Metodo getter do atributo Saldo
     *
     * @return a soma do saldo + limite
     */
    public double getSaldo() {
        return this.saldo + this.limite;
    }

    @Override
    public String toString() {
        return "O saldo da conta eh " + this.getSaldo();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Conta verificar)) return false;
        else return  verificar.getSaldo() == this.getSaldo();
    }
    
}
