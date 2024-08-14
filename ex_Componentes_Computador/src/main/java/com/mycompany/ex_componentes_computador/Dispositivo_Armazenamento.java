/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_componentes_computador;

/**
 *
 * @author Marcelly
 */
public class Dispositivo_Armazenamento extends Produto {
    private String tipo_conexao;
    private int capacidadeArmazenamento;

    public Dispositivo_Armazenamento(String tipo_conexao, int capacidadeArmazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.tipo_conexao = tipo_conexao;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipo_conexao() {
        return tipo_conexao;
    }

    public void setTipo_conexao(String tipo_conexao) {
        this.tipo_conexao = tipo_conexao;
    }
    
    
}
