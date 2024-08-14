/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_nome_idade;

import java.util.Scanner;

/**
 *
 * @author Marcelly
 */
public class Ex_Nome_Idade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Digite seu peso: ");
        double peso = teclado.nextDouble();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    
        teclado.close();
    }
}
