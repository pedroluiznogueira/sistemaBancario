package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

    private static EntityManagerFactory entityManagerFactory = null;
    private static EntityManager entityManager = null;

    public static EntityManager getConexao() {
        // se eu não tiver criado a conexão com o banco ainda
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("sistema-financeiro");
        }

        // se eu ainda assim não tiver criado o manager apartir do factory
        if (entityManager ==  null) {
            entityManager = entityManagerFactory.createEntityManager();
        }

        return entityManager;
    }
}
