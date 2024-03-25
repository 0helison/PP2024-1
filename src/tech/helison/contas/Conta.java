package tech.helison.contas;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public boolean sacar(double value) {
        if(this.saldo >= value) {
            this.saldo = this.saldo - value;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double value) {
        if(value >= 0) {
            this.saldo = this.saldo + value;
            return true;
        } else {
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
