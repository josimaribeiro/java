package model;

public class ContaBancaria {

    private int numero;
    private String nome;
    private double saldo;
    private double limite;

    public boolean saca(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depositado " + valor);
    }

    public boolean transfere(ContaBancaria destino, double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferido " + valor + " para a conta de " + destino.getNome());
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    
}
