/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_notacaoponto;

/**
 *
 * @author Marcelly
 */
public class Exemplo_NotacaoPonto {

    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando metodos Strings - Maiusculas
        System.out.println("Concatenação Maiuscula: " + nomeCompleto.toUpperCase());

        // exibindo nome completo usando métodos Strings - minúsculas
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());

    }
}
