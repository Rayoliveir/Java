/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_componentes_computador;

/**
 *
 * @author Marcelly
 */
public class Processador extends Produto{
    private int Frequencia;

    public Processador(int Frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.Frequencia = Frequencia;
    }

    public int getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(int Frequencia) {
        this.Frequencia = Frequencia;
    }

    
    
    
}
