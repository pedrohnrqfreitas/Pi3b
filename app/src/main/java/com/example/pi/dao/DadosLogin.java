package com.example.pi.dao;

final class DadosLogin {

    private static final String tbLogin = " tbLogin ";
    private static final String id = " id ";
    private static final String cliente = " cliente ";
    private static final String senha = " senha ";

    private DadosLogin() {
    }

    public static String getTbLogin() {
        return tbLogin;
    }

    public static String getCliente() {
        return cliente;
    }

    public static String getId() {
        return id;
    }

    public static String getSenha() {
        return senha;
    }
}
