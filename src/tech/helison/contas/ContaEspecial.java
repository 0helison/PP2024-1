package tech.helison.contas;

public class ContaEspecial extends Conta{

    private double limite;

    public ContaEspecial() {
        super();
    }
    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public boolean sacar(double value) {
        if(getSaldo() >= value) {
            setSaldo(getSaldo() - (value * 0.99)) ;
            return true;
        } else {
            return false;
        }
    }

}
