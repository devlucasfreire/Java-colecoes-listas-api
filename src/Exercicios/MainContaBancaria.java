package Exercicios;

import modelosExercicios.ContaBancaria;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {

        var conta = new ContaBancaria("Lucas Lopes Freire", 707032, 510.50);
        var conta1 = new ContaBancaria("José Felipe", 423723, 200);
        var conta2 = new ContaBancaria("Fernando Jose Fialho", 721398, 900.43);
        var conta3 = new ContaBancaria("Dilma da Silva", 999999, 1000000);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta);
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        for (ContaBancaria c: listaContas) {
            if (c.getSaldoConta() > contaMaiorSaldo.getSaldoConta()) {
                contaMaiorSaldo = c;
            }
        }

        System.out.println("A conta com maior saldo é de: " + contaMaiorSaldo.getNomeConta());
        System.out.println("Saldo da conta: " + contaMaiorSaldo.getSaldoConta());

    }
}
