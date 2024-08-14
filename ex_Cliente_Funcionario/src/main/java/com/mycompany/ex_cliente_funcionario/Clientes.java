/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_funcionario;

/**
 *
 * @author Marcelly
 */
public class Clientes {
    private String nome;
    private int idade;

    //construtior

    public Clientes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
