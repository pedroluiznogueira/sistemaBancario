package br.com.minhaempresa.domain;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ContaConjunta extends Conta {
    private List<Cliente> outrosTitulares = new ArrayList<Cliente>();

    public ContaConjunta(Cliente titular) {
        super(titular);
    }

    public List<Cliente> getOutrosTitulares() {
        return outrosTitulares;
    }

    public void setOutrosTitulares(List<Cliente> outrosTitulares) {
        this.outrosTitulares = outrosTitulares;
    }
}