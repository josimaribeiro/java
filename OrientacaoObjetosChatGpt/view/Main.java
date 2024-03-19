package view;

import model.ContaBancaria;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNome("João");
        conta1.setSaldo(1000);
        conta1.setLimite(500);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNome("Maria");

        // Transferindo 700 de conta1 para conta2
        double valorTransferencia = 700;
        if (conta1.transfere(conta2, valorTransferencia)) {
            System.out.println("Transferência de " + valorTransferencia + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência de " + valorTransferencia);
        }

        System.out.println("Saldo de " + conta1.getNome() + ": " + conta1.getSaldo());
        System.out.println("Saldo de " + conta2.getNome() + ": " + conta2.getSaldo());
    }
}
