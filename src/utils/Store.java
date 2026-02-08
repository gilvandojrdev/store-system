package dev.frgilvando.utils;

public class Products {
    private String nome;
    private double preco;

    public Products(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
    
};
