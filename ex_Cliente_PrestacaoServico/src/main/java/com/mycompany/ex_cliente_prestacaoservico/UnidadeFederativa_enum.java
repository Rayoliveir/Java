package com.mycompany.ex_cliente_prestacaoservico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Marcelly
 */
public enum UnidadeFederativa_enum {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São paulo", "SP"),
    RIO_DE_JANEIRO("Rio de janeiro", "RJ");
    
    String nome;
    String sigla;

    private UnidadeFederativa_enum(String nome, String sigla) {
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
