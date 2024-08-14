/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_informacoes_funcionario_plus;

/**
 *
 * @author Marcelly
 */
public class Funcionario_Plus {
    private String nome;
    private double salario;
    private int id;
    private int idade;
    private Setor setor;
    private Sexo sexo;

    public Funcionario_Plus(String nome, double salario, int id, int idade, Setor setor, Sexo sexo) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
        this.idade = idade;
        this.setor = setor;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public Setor getSetor() {
        return setor;
    }

    public Sexo getSexo() {
        return sexo;
    }    
}
