/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_funcionario_m.e.m;

/**
 *
 * @author Marcelly
 */
public class Engenheiro extends Funcionario_abstract{
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    

    @Override
    public String toString() {
        return super.toString() + 
               "\nCrea: " + crea;
    }
    
    

}
