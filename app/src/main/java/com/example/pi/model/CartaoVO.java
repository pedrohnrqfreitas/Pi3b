package com.example.pi.model;

public class CartaoVO {
    private final String tipoCartao;
    private final String numeroCartao;
    private final String dataValidade;
    private final String nomeTitular;
    private final String cvv;

    public CartaoVO(String tipoCartao, String numeroCartao, String dataValidade, String nomeTitular, String cvv) {
        this.tipoCartao = tipoCartao;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.nomeTitular = nomeTitular;
        this.cvv = cvv;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
}
