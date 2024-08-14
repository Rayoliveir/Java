/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplo_enum_sexo;

/**
 *
 * @author Marcelly
 */
public class Exemplo_enum_Sexo {

    public static void main(String[] args) {
        Clientes clientes = new Clientes("Marta", Sexo.FEMININO);

        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Sexo: " + clientes.getSexo());

    }
}
