/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex_informacoes_funcionario_plus;

/**
 *
 * @author Marcelly
 */
public class Ex_Informacoes_Funcionario_plus {

    public static void main(String[] args) {
        Funcionario_Plus funcionario = new Funcionario_Plus("Marta", 5000.00, 5656, 25, Setor.VENDAS, Sexo.FEMININO);

        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Sexo: " + funcionario.getSexo().getTexto());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Setor: " + funcionario.getSetor().getTexto());
        System.out.println("Salario: " + funcionario.getSalario());
    }
}
