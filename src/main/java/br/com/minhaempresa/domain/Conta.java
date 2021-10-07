package br.com.minhaempresa.domain;

import br.com.minhaempresa.exceptions.SaldoInsuficienteException;

public abstract class Conta {

    private int id;
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta(Cliente titular) {
        this.saldo = 0;
        this.numero = "1";
        this.titular = titular;
    }

    public Conta(Cliente titular, String conta) {
        this.saldo = 0;
        this.numero =  numero;
        this.titular = titular;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void sacar(double valor) throws IllegalArgumentException, SaldoInsuficienteException {
        System.out.println("Tentativa de saque na conta" + this.numero + " no valor de: " + valor);
        if (valor <= 0) {
            // avisar que aqui pode ter uma excessão
            throw new IllegalArgumentException("Valor para saque pode ser menor ou igual a 0");
            // ou você avisa essa excessão ou você trata aqui
        }
        if (saldo < valor) {
            // avisar que aqui pode ter uma excessão
            throw new SaldoInsuficienteException("Saldo pode ser insuficiente - Usando SaldoInsuficienteException -");
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Consumível passa a excessão à frente, pois quer que a excessão seja tratada pelo Consumidor
    public void transferir(double valor, Conta destino) throws Exception {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}