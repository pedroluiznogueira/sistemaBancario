package br.com.minhaempresa.services;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;
import br.com.minhaempresa.repository.ContaRepository;

public class ConsultarSaldoService {

    public double consultarSaldo(String nome, String sobrenome) {
        Cliente cliente = new Cliente(nome, sobrenome);
        Conta conta = new ContaCorrente(cliente);

        // quem vai ao banco é o Conta Repository
        ContaRepository contaRepository = new ContaRepository();
        return contaRepository.consultarSaldo();
    }
}
