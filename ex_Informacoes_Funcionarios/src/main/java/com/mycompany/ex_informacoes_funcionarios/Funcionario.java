/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_informacoes_funcionarios;

/**
 *
 * @author Marcelly
 */
public class Funcionario {
    private String nome;
    private double salario;
    private int id;
    private int idade;
    private Setor setor;
    private Sexo sexo;

    public Funcionario(String nome, double salario, int id, int idade, Setor setor, Sexo sexo) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    
}
