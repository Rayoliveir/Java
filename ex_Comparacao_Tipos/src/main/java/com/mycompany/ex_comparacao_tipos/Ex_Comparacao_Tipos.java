/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_comparacao_tipos;

/**
 *
 * @author Marcelly
 */
public class Ex_Comparacao_Tipos {

    public static void main(String[] args) {
        String nomeUsuario = "Marta";
        int senha = 123;

        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 123);

        System.out.println("O nome do usúario está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
