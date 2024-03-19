package tech.helison.contas;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.numero = 1;
        conta1.saldo = 10000;
        conta1.depositar(10000);

        System.out.println("Número da conta 1: " + conta1.numero);
        System.out.println("Número da saldo 1: " + conta1.saldo);
        System.out.println("Saque ? " + conta1.sacar(3000));

        ContaEspecial contaEspecial1 = new ContaEspecial();

        contaEspecial1.numero = 2;
        contaEspecial1.saldo = 20000;
        contaEspecial1.depositar(10000);

        System.out.println("Número da conta 2: " + contaEspecial1.numero);
        System.out.println("Número da saldo 2: " + contaEspecial1.saldo);
        System.out.println("Saque ? " + contaEspecial1.sacar(60000));
    }

}
