package br.com.minhaempresa.domain;

public class Cliente {

    private String identificador;
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        this.nome  = nome;
        this.sobrenome = sobrenome;
    }

    // ao falar de criação de objeto falamos de construtor

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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }
}