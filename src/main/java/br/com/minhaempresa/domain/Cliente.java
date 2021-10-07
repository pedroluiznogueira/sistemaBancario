package br.com.minhaempresa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cliente implements Serializable {

    // isso serve para fazermos o tráfego de informação em bytes entre tecnologias
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nome;
    private String sobrenome;

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome) {
        this.nome  = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        if (nome == null) {
            System.out.println("Nome inválido");
        } else {
            this.nome = nome;
        }
    }

    public String getSobrenome() {

        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }

    public String getId() {
        return id;
    }

    public void setId(String identificador) {
        this.id = identificador;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }
}