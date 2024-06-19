package com.example.pi.model;

public class TransferenciaVO {
    private final String nome;
    private final double valor;

    public TransferenciaVO(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
