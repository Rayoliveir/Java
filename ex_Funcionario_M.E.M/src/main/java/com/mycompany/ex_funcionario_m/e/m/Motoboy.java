/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_funcionario_m.e.m;

/**
 *
 * @author aluno.den
 */
public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }
    
    

    @Override
    public String toString() {
        return "\n*== DADOS DO MOTOBOY ==*"
                + "\nnome: " + nome 
                + "\ncpf: " + cpf 
                + "\nrg: " + rg 
                + "\nsalario: " + salario
                + "\ncnh: " + cnh;
              
    
    
    }
    
    
}
