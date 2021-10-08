package br.com.minhaempresa.domain;

import javax.persistence.Entity;

@Entity
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }
}