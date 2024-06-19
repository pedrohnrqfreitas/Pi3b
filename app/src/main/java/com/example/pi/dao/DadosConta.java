package com.example.pi.dao;

import org.jetbrains.annotations.Contract;

final class DadosConta {
    private static final String tbConta = " tb_conta ";
    private static final String keyId = " id ";
    private static final String conta = " conta ";
    private static final String agencia = " agencia ";
    private static final String saldo = " saldo ";
    private static final String credito = " credito ";

    private DadosConta() {}

    @Contract(pure = true)
    public static String getTbConta() {
        return tbConta;
    }

    public static String getConta() {
        return conta;
    }

    @Contract(pure = true)
    public static String getKeyId() {
        return keyId;
    }

    @Contract(pure = true)
    public static String getAgencia() {
        return agencia;
    }

    @Contract(pure = true)
    public static String getSaldo() {
        return saldo;
    }

    @Contract(pure = true)
    public static String getCredito() {
        return credito;
    }


}