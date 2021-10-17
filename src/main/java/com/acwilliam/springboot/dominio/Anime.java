package com.acwilliam.springboot.dominio;


public class Anime {

    private String nome;


    public Anime(){
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
