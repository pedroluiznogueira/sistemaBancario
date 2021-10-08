package br.com.minhaempresa.domain;

import javax.persistence.Entity;

@Entity
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public ContaCorrente(Cliente titular, String numero) {
        super(titular);
    }
}