/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_pessoa_fisicajuridica;

/**
 *
 * @author Marcelly
 */
public class Fisica {
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica() {
    }

    public Fisica(String cpf, String rg, String dataNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "== Pessoa Fisica ==" + 
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\nDataNascimento: " + dataNascimento;
    }

    
}
