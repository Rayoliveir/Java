/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex_media_aluno;

import java.util.Scanner;

/**
 * Faça um metodo que calcule a média de um aluno
 * de acordo com o criterio definido neste curso
 * 
 * Além disso, faça um outro método que informe o 
 * status do aluno de acordo a tabela abaixo
 * 
 * >= 7 == aprovado
 * >= 5 == verificação suplementar
 * : reprovado
 * @author Marcelly
 */
public class Ex_Media_Aluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double primeiraNota = teclado.nextDouble();

        System.out.println("Segunda nota: ");
        double segundaNota = teclado.nextDouble();

        double soma = primeiraNota + segundaNota;
        double media = soma / 2;

        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Verificação suplementar!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
