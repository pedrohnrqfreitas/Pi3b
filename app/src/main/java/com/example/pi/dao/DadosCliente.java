package com.example.pi.dao;

import org.jetbrains.annotations.Contract;

final class DadosCliente {
    private static final String tbClientes = " tb_clientes ";
    private static final String keyId = " id ";
    private static final String idCliente = " cliente ";
    private static final String nome = " nome ";
    private static final String endereco = " endereco ";
    private static final String email = " email ";
    private static final String ddd = " ddd ";
    private static final String telefone = " telefone ";
    private static final String cpf = " cpf ";
    private static final String foto = " foto ";

    private DadosCliente() {
    }

    @Contract(pure = true)
    public static String getTbClientes() {
        return tbClientes;
    }

    @Contract(pure = true)
    public static String getKeyId() {
        return keyId;
    }

    public static String getIdCliente() {
        return idCliente;
    }

    @Contract(pure = true)
    public static String getNome() {
        return nome;
    }

    @Contract(pure = true)
    public static String getEndereco() {
        return endereco;
    }

    @Contract(pure = true)
    public static String getEmail() {
        return email;
    }

    public static String getDdd() {
        return ddd;
    }

    @Contract(pure = true)
    public static String getTelefone() {
        return telefone;
    }

    @Contract(pure = true)
    public static String getCpf() {
        return cpf;
    }

    public static String getFoto() {
        return foto;
    }
}