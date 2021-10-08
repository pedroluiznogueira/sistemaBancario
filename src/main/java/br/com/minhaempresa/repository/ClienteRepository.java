package br.com.minhaempresa.repository;

import br.com.minhaempresa.domain.Cliente;

import javax.persistence.EntityManager;

public class ClienteRepository {

    private EntityManager entityManager = Conexao.getConexao();

    public Cliente buscarCliente(int id) {
        // buscando o cliente com o find do entity manager
        return this.entityManager.find(Cliente.class, id);
    }
}
