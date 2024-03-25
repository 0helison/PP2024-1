package tech.helison.app;

import tech.helison.contas.*;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta(1, 5000);
        ContaEspecial contaesp1 = new ContaEspecial(2, 20000, 10000);
        ContaInvestimento contaInv1 = new ContaInvestimento(3, 45000, 1, 20);

        System.out.println(conta1.depositar(1500));
        System.out.println(conta1.getSaldo());

        System.out.println("-----------------------------------------------");

        System.out.println(contaesp1.sacar(60000));
        System.out.println(contaesp1.sacar(2000));
        System.out.println(contaesp1.getSaldo());

        System.out.println("-----------------------------------------------");

        System.out.println(contaInv1.sacar(80000));
        System.out.println(contaInv1.sacar(13000));
        System.out.println(contaInv1.depositar(12000));
        System.out.println(contaInv1.getSaldo());




    }

}
