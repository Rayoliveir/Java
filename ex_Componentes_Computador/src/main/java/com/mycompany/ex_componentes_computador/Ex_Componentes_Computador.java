/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_componentes_computador;

/**
 *
 * @author Marcelly
 */
public class Ex_Componentes_Computador {

    public static void main(String[] args) {
        Processador processador = new Processador(144, "Intel", "3 3350");
        Placa_Mae placaMae = new Placa_Mae("Sata", "Intel", "3");
        Memoria  memoria = new Memoria(12, 512, "strydisk", "3");
        Dispositivo_Armazenamento disp_armazenamento = new Dispositivo_Armazenamento("Sata", 256, "Intel", "4");
        
        
        System.out.println("*== COMPONENTES DO COMPUTADOR ==*");
        System.out.println("*\n== PROCESSADOR ==*");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frequência: " + processador.getFrequencia());
        //System.out.println("\n");
        System.out.println("*== PLACA MÃE ==*");
        System.out.println("Marca: " + placaMae.getMarca());
        System.out.println("Modelo: " + placaMae.getModelo());
        System.out.println("Soquete" + placaMae.getSoquete());
        //System.out.println("\n");
        System.out.println("*== MEMÓRIA ==*");
        System.out.println("Marca: "  + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Frequencia: " +  memoria.getFrequencia());
        //System.out.println("Capacidade de armazeenamento: " = memoria.getCapacidadeArmaznamento());
        //System.out.println("\n");
        System.out.println("*== DISPOSITIVO DE ARMAZENAMENTO ==*");        
        System.out.println("Marca: " + disp_armazenamento.getMarca());
        System.out.println("Modelo: "  + disp_armazenamento.getModelo());
        System.out.println("Tipo de conexao: " + disp_armazenamento.getTipo_conexao());
        System.out.println("Capacidade de armazeenamento: " + disp_armazenamento.getCapacidadeArmazenamento());
    }
}
