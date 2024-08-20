/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_prestacaoservico;

/**
 *
 * @author Marcelly
 */
public abstract class Pessoa_class_abstract {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco_class endereco;

    public Pessoa_class_abstract(String nome, String telefone, String email, Endereco_class endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Endereco_class getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco_class endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nTelefone: " + telefone + 
               "\nEmail: " + email + 
               "\n\n-- Endereco --" + endereco.toString();
    }
    
    
    
    
}
