package com.example.pi.model;

public class ClienteVO {
    private final String nome;
    private final String cpf;
    private final String email;
    private final String telefone;
    private final String endereco;
    private final byte[] foto;

    public ClienteVO(String nome, String cpf, String email, String telefone, String endereco, byte[] foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public byte[] getFoto() {
        return foto;
    }
}
