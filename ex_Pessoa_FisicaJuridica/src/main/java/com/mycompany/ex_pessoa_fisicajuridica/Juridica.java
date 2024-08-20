/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_pessoa_fisicajuridica;

/**
 *
 * @author Marcelly
 */
public class Juridica {
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\n== Pessoa Juridica =="  + 
                "\nCnpj: " + cnpj + 
                "\nInscricao Estadual: " + inscricaoEstadual;
    }
    
    
    
    
}
