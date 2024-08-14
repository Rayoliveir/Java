/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_componentes_computador;

/**
 *
 * @author Marcelly
 */
public class Placa_Mae extends Produto {
    private String soquete;

    public Placa_Mae(String soquete, String marca, String modelo) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }
    
    
}
