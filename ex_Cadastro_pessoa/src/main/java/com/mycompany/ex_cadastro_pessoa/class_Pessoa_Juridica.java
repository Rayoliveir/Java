/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cadastro_pessoa;

import java.time.LocalDate;

/**
 *
 * @author aluno.den
 */
public class class_Pessoa_Juridica extends abstract_Pessoa {
    enum_Sexo sexo;
    String cnpj;
    String incricaoEstadual;
    String dataInicio;
    String dataTermino;
    double valorContrato;

    public class_Pessoa_Juridica(enum_Sexo sexo, String cnpj, String incricaoEstadual, String dataInicio, String dataTermino, double valorContrato, int id, String nome, String telefone, class_Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.sexo = sexo;
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }


    @Override
    public String toString() {
        return "\n== DADOS PESSOA JURIDICA ==" + 
                super.toString() +
                "\nSexo: " + sexo + 
                "\nCNPJ: " + cnpj + 
                "\nIncricao Estadual: " + incricaoEstadual + 
                "\nData de Inicio: " + dataInicio + 
                "\nData de Termino: " + dataTermino + 
                "\nValor do Contrato: " + valorContrato;
    }
    
    

}
