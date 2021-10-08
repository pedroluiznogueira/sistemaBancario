package br.com.minhaempresa.services;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;
import br.com.minhaempresa.repository.ClienteRepository;
import br.com.minhaempresa.repository.ContaRepository;

public class ConsultarSaldoService {

    private ClienteRepository clienteRepository = new ClienteRepository();

    public double consultarSaldo(int id) {

        Cliente cliente = clienteRepository.buscarCliente(id);
        Conta conta = new ContaCorrente(cliente);

        return ;
    }
}
