/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_enum_sexo;

/**
 *
 * @author Marcelly
 */
public class Clientes {

    private String nome;
    private Sexo sexo;

    //constructor
    public Clientes(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    // getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
