/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_conta_bancaria_funcionario;

/**
 *
 * @author Marcelly
 */
public class Funcionario {
    private String codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Conta_Bnacaria conta_banco;

    public Funcionario(String codigo, String nome, String endereco, String telefone, String email, Conta_Bnacaria conta_banco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.conta_banco = conta_banco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta_Bnacaria getConta_banco() {
        return conta_banco;
    }

    public void setConta_banco(Conta_Bnacaria conta_banco) {
        this.conta_banco = conta_banco;
    }
    
    
    
    
}
