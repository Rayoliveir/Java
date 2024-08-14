/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_loja_mamao_acucar;

import java.util.Scanner;

/**
 * A loja mamao com açúcar esá vendendo seus produtos em 5 prestações sem juros. faça um programa 
 * que receba um valor de uma compra e mostre o valor das prestações
 * 
 * no final informar o nome do mercado e valor das parcelas
 *
 * @author aluno.den
 */
public class Ex_Loja_Mamao_Acucar {

    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        
        System.out.println("Insira o valor da compra: ");
        double valor = teclado.nextDouble();

        double valorDividido = valor / 5;
        
        System.out.println("Valor do Produto: " + valor);
        System.out.println("Valor das parcelas: " + valorDividido);
        
        teclado.close();
    }
}
