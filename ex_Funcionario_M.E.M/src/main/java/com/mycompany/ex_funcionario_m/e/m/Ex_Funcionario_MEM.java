/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_funcionario_m.e.m;

/**
 *
 * @author Marcelly
 */
public class Ex_Funcionario_MEM {

    public static void main(String[] args) {
        Medico medico = new Medico("2133", "joana", "762746238", "1125335126", 26478);
        Engenheiro engenheiro = new Engenheiro("236473", "marcos", "7236473", "5324362345", 3472897);
        Motoboy motoboy = new Motoboy("3754762", "julia", "23646237", "872348723", 231);
        
        System.out.println(motoboy.toString());
        System.out.println(medico.toString());
        System.out.println(engenheiro.toString());
                

    }
}
