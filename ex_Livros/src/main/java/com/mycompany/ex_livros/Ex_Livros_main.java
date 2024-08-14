/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_livros;

/**
 *
 * @author Marcelly
 */
public class Ex_Livros_main {

    public static void main(String[] args) {
        Livros livro1 = new Livros("kkkkk", "thuer", 500, 34.90);
        Livros livro2 = new Livros("AJKSFHJD","DHGFJKDS", 588, 53.45);
        
        
        System.out.println("\nPRIMEIRO LIVRO");
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Quantidade de páginas: " + livro1.getNumero_paginas());
        System.out.println("Preço: " + livro1.getTitulo());
    
        System.out.println("\nSEGUNDO LIVRO");
        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Quantidade de páginas: " + livro2.getNumero_paginas());
        System.out.println("Preço: " + livro2.getTitulo());

    }
}
