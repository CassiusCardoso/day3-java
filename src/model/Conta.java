package model;

public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(){}

    public Conta(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     // Depositar
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Valor depositado com sucesso!");
    }
    // Sacar
    public void sacar(double valor){
        if(valor >= this.saldo){
            System.out.println("Você não tem saldo suficente para sacar!");
        }
        this.saldo -= valor;
        System.out.println("Valor sacado com sucesso!");
    }

    public void exibirInfo(){
        System.out.println("Número conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
}
