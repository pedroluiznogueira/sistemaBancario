package br.com.minhaempresa.domain;

import javax.persistence.Entity;

@Entity
public class ContaCorrente extends Conta {

    // mesmo não tendo atributos à serem mapeados, os atributos da super classe serão os mapeados na criaçã dessa tabela

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public ContaCorrente(Cliente titular, String numero) {
        super(titular);
    }
}