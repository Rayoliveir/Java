/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_contratacaomotoboy;

/**
 *
 * @author aluno.den
 */
public class Motoboy extends Funcionario {
    private String carteiraHabilitacao;

    public Motoboy(String carteiraHabilitacao, String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return this.getSalarioBase();
    }

    @Override
    public String toString() {
        return "Motoboy: " +
                super.toString() +
               "\nCarteira Habilitacao: " + carteiraHabilitacao;
    }
    
    
    
    
}
