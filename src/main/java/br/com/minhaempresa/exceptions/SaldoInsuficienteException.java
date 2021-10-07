package br.com.minhaempresa.exceptions;

public class SaldoInsuficienteException extends Exception {
    private String message;

    public SaldoInsuficienteException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}