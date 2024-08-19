/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ex_cadastro_pessoa;

/**
 *
 * @author aluno.den
 */
public enum enum_Unidade_Federativa {
    BAHIA ("Bahia", "BA"),
    SAO_PAULO ("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de janeiro", "RJ");
    
    private String nome;
    private String sigla;

    private enum_Unidade_Federativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    
}
