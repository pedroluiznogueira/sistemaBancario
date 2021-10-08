package br.com.minhaempresa.services;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;
import br.com.minhaempresa.repository.ClienteRepository;

public class ConsultarSaldoService {

    private ClienteRepository clienteRepository = new ClienteRepository();

    public double consultarSaldo(int id) {

        // -- ESTOU NA CAMADA SERVICE ACESSANDO A CAMADA REPOSITORY --
        Cliente cliente = clienteRepository.buscarCliente(id);
        Conta conta = new ContaCorrente(cliente);

        return conta.consultarSaldo();
    }
}
