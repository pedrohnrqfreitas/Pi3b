package com.example.pi.dao;

import org.jetbrains.annotations.Contract;

final class DadosHistorico {
    private static final String tbHistorico = " tb_historico ";
    private static final String keyId = " id ";
    private static final String conta = " conta ";
    private static final String tipo = " tipo ";
    private static final String nome = " nome ";
    private static final String valor = " valor ";


    private DadosHistorico() {
    }

    @Contract(pure = true)
    public static String getTbHistorico() {
        return tbHistorico;
    }

    @Contract(pure = true)
    public static String getKeyId() {
        return keyId;
    }

    @Contract(pure = true)
    public static String getConta() {
        return conta;
    }

    @Contract(pure = true)
    public static String getTipo() {
        return tipo;
    }

    @Contract(pure = true)
    public static String getNome() {
        return nome;
    }

    @Contract(pure = true)
    public static String getValor() {
        return valor;
    }


}