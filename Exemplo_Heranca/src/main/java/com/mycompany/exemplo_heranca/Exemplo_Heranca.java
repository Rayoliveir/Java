/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplo_heranca;

/**
 *
 * @author Marcelly
 */
public class Exemplo_Heranca {

    public static void main(String[] args) {
        Processador processador = new Processador(3.5, "AMD", "Ryzen 7");

        Memoria memoria = new Memoria("8GB", "intel", "15");

        System.out.println("PROCESSADOR");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequencia: " + processador.getFrequencia());

        System.out.println("MEMORIA");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Capacidade de armazenamento: " + memoria.getCapacidadeArmazenamento());

    }
}
