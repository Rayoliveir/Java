/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ex_cliente_prestacaoservico;

/**
 *
 * @author Marcelly
 */
public enum Sexo_enum {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    String sexo;

    private Sexo_enum(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
    
    
}
