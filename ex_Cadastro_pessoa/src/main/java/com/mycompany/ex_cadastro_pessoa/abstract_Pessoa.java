/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cadastro_pessoa;

/**
 *
 * @author aluno.den
 */
public abstract class abstract_Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;
    protected class_Endereco endereco;

    public abstract_Pessoa(int id, String nome, String telefone, class_Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  "\nID: " + id + 
                "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nEndereco: " + endereco;
    }
    
}
