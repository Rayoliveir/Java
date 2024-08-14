/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex_informacoes_funcionarios;

/**
 *
 * @author Marcelly
 */
public class Ex_Informacoes_Funcionarios {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Marta", 5000.00, 5656, 25, Setor.VENDAS, Sexo.FEMININO);

        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Salario: " + funcionario.getSalario());

    }
}
