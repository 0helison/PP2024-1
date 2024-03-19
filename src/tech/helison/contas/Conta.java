package tech.helison.contas;

public class Conta {
    int numero;
    double saldo;

    boolean sacar(double value) {
        if(this.saldo >= value) {
            this.saldo = this.saldo - value;
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double value) {
        if(value >= 0) {
            this.saldo = this.saldo + value;
            return true;
        } else {
            return false;
        }
    }

    double getSaldo() {
        return this.saldo;
    }
}
