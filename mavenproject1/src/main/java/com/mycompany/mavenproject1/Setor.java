/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author aluno.den
 */
public enum Setor {
    ENGENHARIA("Engenharia"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    private String setor;

    private Setor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
    
    
}
