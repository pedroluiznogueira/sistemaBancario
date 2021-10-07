package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;

public class ContaRepository {

    public double consultarSaldo() {

        // instanciando a classe que faz a conexao
        Conexao conexao = new Conexao();
        // usando o métood que faz a conexao
        EntityManager em = conexao.getConexao();

        return 0;
    }

    public void inserirDeposito() {

        // instanciando a classe que faz a conexao
        Conexao conexao = new Conexao();
        // usando o métood que faz a conexao
        EntityManager em = conexao.getConexao();
    }
}
