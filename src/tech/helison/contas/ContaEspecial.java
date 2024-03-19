package tech.helison.contas;

public class ContaEspecial extends Conta{

    double limite;

    boolean withdraw(double value) {
        if(this.saldo >= value) {
            this.saldo = this.saldo - (value * 0.99);
            return true;
        } else {
            return false;
        }
    }

}
