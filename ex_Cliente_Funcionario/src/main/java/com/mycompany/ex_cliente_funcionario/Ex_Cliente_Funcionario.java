/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex_cliente_funcionario;

/**
 *
 * @author Marcelly
 */
public class Ex_Cliente_Funcionario {

    public static void main(String[] args) {
        // instanciando um objetos
        Clientes cliente = new Clientes("Marta", 20);
        Funcionarios funcionario = new Funcionarios("Jose", "Gerente", 5000);

        // cliente.nome = "Marta";
        //cliente.idade = 18;
        
        // cliente.setNome("Marta");
        // cliente.setIdade(20);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());

        System.out.println("\nDADOS DO FUNCIONARIO");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}
