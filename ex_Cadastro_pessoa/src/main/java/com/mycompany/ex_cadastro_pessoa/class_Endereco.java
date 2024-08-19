/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cadastro_pessoa;

/**
 *
 * @author aluno.den
 */
public class class_Endereco {
    private String longradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private enum_Unidade_Federativa uf;

    public class_Endereco(String longradouro, String numero, String complemento, String cep, String cidade, enum_Unidade_Federativa uf) {
        this.longradouro = longradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public enum_Unidade_Federativa getUf() {
        return uf;
    }

    public void setUf(enum_Unidade_Federativa uf) {
        this.uf = uf;
    }

    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
}
