/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_funcionario_m.e.m;

/**
 *
 * @author aluno.den
 */
public class Medico extends Funcionario{
    String crm;

    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\n*== DADOS DO MÉDICO ==*"
                super.toString()
                + "crm=" + crm;
    }
    
    
}
