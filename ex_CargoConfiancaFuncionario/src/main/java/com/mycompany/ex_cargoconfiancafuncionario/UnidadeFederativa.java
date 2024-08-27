/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ex_cargoconfiancafuncionario;

/**
 *
 * @author aluno.den
 */
public enum UnidadeFederativa {
    BAHIA("Bahia"),
    SAO_PAULO("São paulo"),
    RIO_DE_JANEIRO("Rio de janeiro"),
    MINAS_GERAIS("Minas gerais");

    private String uf;

    private UnidadeFederativa(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }
}
