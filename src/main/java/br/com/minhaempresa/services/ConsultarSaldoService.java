package br.com.minhaempresa.services;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;

public class ConsultarSaldoService {

    public double consultarSaldo(String nome, String sobrenome) {
        Cliente cliente = new Cliente(nome, sobrenome);
        Conta conta = new ContaCorrente(cliente);

        return conta.consultarSaldo();
    }
}
