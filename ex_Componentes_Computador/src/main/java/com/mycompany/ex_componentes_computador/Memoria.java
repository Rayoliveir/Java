/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_componentes_computador;

/**
 *
 * @author Marcelly
 */
public class Memoria extends Produto {
    private int capacidadeArmaznamento;
    private int frequencia;

    public Memoria(int capacidadeArmaznamento, int frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeArmaznamento = capacidadeArmaznamento;
        this.frequencia = frequencia;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getCapacidadeArmaznamento() {
        return capacidadeArmaznamento;
    }

    public void setCapacidadeArmaznamento(int capacidadeArmaznamento) {
        this.capacidadeArmaznamento = capacidadeArmaznamento;
    }
    
    
}
