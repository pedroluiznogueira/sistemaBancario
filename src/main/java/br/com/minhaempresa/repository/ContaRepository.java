package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;

public class ContaRepository {

    public double consultarSaldo() {
        EntityManager em = Conexao.getConexao();

        return 0;
    }

    public void inserirDeposito() {
        EntityManager em = Conexao.getConexao();
    }
}
