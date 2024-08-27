/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_calculadora;

/**
 *
 * @author aluno.den
 */
public class Ex_Calculadora {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
                
        System.out.println(soma.calcular(2, 2));
        System.out.println(subtracao.calcular(2, 2));
        System.out.println(multiplicacao.calcular(2, 2));
        System.out.println(divisao.calcular(2, 2));
    }
}
