package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

    // vai pegar um Factory e apartir dele retornar um Manager
    public EntityManager getConexao() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistema-financeiro");
        return emf.createEntityManager();
    }
}
