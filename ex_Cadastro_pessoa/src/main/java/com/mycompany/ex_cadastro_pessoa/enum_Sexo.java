/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ex_cadastro_pessoa;

/**
 *
 * @author aluno.den
 */
public enum enum_Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String sexo;

    private enum_Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
    
    
}
