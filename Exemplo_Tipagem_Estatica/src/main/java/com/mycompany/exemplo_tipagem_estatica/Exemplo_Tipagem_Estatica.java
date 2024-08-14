/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplo_tipagem_estatica;

/**
 *
 * @author Marcelly
 */
public class Exemplo_Tipagem_Estatica {

    public static void main(String[] args) {
        String nome = "Marta";
        int idade = 30;
        double peso = 65.2;

        //declaração de constantes
        final String CPF = "123.456.789.00";

        //Exibindo resultados
        //Concatenando com sinal de "+"
        //sout + tab == System.out.println(""); 
        System.out.println("O nome do usuario é: " + nome);
        System.out.println("O CPF do usuario é: " + CPF);
        System.out.println("O peso do usuario é: " + idade + "anos");
        System.out.println("A idade do usuario é: " + peso + "quilos");
    }
}
