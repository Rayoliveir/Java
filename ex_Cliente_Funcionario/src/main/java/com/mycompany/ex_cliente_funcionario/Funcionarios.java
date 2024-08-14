/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_funcionario;

/**
 *
 * @author Marcelly
 */
public class Funcionarios {

    private String nome;
    private String funcao;
    private double salario;

    // contructor
    public Funcionarios(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    //métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
