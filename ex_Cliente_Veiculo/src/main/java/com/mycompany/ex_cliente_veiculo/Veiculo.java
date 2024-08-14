/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_veiculo;

/**
 *
 * @author Marcelly
 */
public class Veiculo {
    private String placa;
    private String cor;
    private int numero_passageiros;
    private int capacidade_tanque;
    private int velocidade_maxima;
    private int consumo_medio;

    public Veiculo(String placa, String cor, int numero_passageiros, int capacidade_tanque, int velocidade_maxima, int consumo_medio) {
        this.placa = placa;
        this.cor = cor;
        this.numero_passageiros = numero_passageiros;
        this.capacidade_tanque = capacidade_tanque;
        this.velocidade_maxima = velocidade_maxima;
        this.consumo_medio = consumo_medio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero_passageiros() {
        return numero_passageiros;
    }

    public void setNumero_passageiros(int numero_passageiros) {
        this.numero_passageiros = numero_passageiros;
    }

    public int getCapacidade_tanque() {
        return capacidade_tanque;
    }

    public void setCapacidade_tanque(int capacidade_tanque) {
        this.capacidade_tanque = capacidade_tanque;
    }

    public int getVelocidade_maxima() {
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(int velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }

    public int getConsumo_medio() {
        return consumo_medio;
    }

    public void setConsumo_medio(int consumo_medio) {
        this.consumo_medio = consumo_medio;
    }
}
