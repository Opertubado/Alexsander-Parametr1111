package com.example.logonrm.alexsander.model;

/**
 * Created by logonrm on 27/10/2017.
 */

public class Item {

    private int id;
    private String nome;

    public Item(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
