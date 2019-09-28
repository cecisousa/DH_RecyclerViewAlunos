package br.com.digitalhouse.dh_recyclerviewalunos.model;

public class Alunos {

    private String nome;
    private String RA;

    public Alunos () {
    }

    public Alunos(String nome, String RA) {
        this.nome = nome;
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
}
