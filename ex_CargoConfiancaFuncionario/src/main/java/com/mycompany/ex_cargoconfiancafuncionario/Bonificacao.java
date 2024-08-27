/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ex_cargoconfiancafuncionario;

/**
 *
 * @author aluno.den
 */
public enum Bonificacao {
    GERENTE (0.35),
    DIRETOR (0.45);
    
    private double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
}
