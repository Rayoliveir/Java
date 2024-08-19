/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cadastro_pessoa;

/**
 *
 * @author aluno.den
 */
public class class_Pessoa_Fisica extends abstract_Pessoa {
    enum_Sexo sexo;
    String cpf;
    String rg;
    String dataNascimento;
    double salario;

    public class_Pessoa_Fisica(enum_Sexo sexo, String cpf, String rg, String dataNascimento, double salario, int id, String nome, String telefone, class_Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    

    @Override
    public String toString() {
        return "\n\n== DADOS PESSOA FISICA =="+ 
                super.toString() +
                "\nSexo: " + sexo + 
                "\nCpf: " + cpf + 
                "\nRg: " + rg +
                "\nDataNascimento: " + dataNascimento + 
                "\nSalario: " + salario;
    }
    
    
    
}
