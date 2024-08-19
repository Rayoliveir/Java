/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_funcionario_m.e.m;

/**
 *
 * @author aluno.den
 */
public class Engenheiro extends Funcionario {
    String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\n*== DADOS DO ENGENHEIRO ==*"
                + "\nnome: " + nome 
                + "\ncpf: " + cpf 
                + "\nrg: " + rg 
                + "\nsalario: " + salario
                + "crea=" + crea;
    }
    
    
}
