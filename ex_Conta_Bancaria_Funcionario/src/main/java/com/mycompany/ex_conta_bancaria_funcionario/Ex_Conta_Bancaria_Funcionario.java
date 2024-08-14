/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex_conta_bancaria_funcionario;

/**
 *
 * @author Marcelly
 */
public class Ex_Conta_Bancaria_Funcionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "LU56", "Lucas", "Rua 4", "(71) 99999-9999", "lu56@gmail.com",
                new Conta_Bnacaria("brasil", "1234", "1234 - 5", "corrente", 50.000, 10.000));

        System.out.println("FUNCIONARIO");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Codigo: " + funcionario.getNome());

    }
}
