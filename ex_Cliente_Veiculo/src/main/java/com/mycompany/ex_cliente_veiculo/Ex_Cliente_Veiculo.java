/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex_cliente_veiculo;

/**
 *
 * @author Marcelly
 */
public class Ex_Cliente_Veiculo {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcos", 19, "000.000.000-00", "rua 17", "(71) 99999-9999");
        Cliente cliente2 = new Cliente("Laura", 52, "000.000.000-00", "rua 21", "(71) 99999-9999");
        Veiculo veiculo1 = new Veiculo("OLB2436", "Marrom", 5, 254, 180, 8);
        Veiculo veiculo2 = new Veiculo("JGF5241", "Verde", 5, 80, 120, 4);

        System.out.println("Cliente");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());

        System.out.println("\n");

        System.out.println("Veículo");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Placa: " + veiculo1.getCor());
        System.out.println("Placa: " + veiculo1.getNumero_passageiros());
        System.out.println("Placa: " + veiculo1.getCapacidade_tanque());
        System.out.println("Placa: " + veiculo1.getVelocidade_maxima());
        System.out.println("Placa: " + veiculo1.getConsumo_medio());

        System.out.println("\n");

        System.out.println("Cliente");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Idade: " + cliente2.getIdade());
        System.out.println("CPF: " + cliente2.getCpf());
        System.out.println("Endereço: " + cliente2.getEndereco());
        System.out.println("Telefone: " + cliente2.getTelefone());

        System.out.println("\n");

        System.out.println("Veículo");
        System.out.println("Placa: " + veiculo2.getPlaca());
        System.out.println("Placa: " + veiculo2.getCor());
        System.out.println("Placa: " + veiculo2.getNumero_passageiros());
        System.out.println("Placa: " + veiculo2.getCapacidade_tanque());
        System.out.println("Placa: " + veiculo2.getVelocidade_maxima());
        System.out.println("Placa: " + veiculo2.getConsumo_medio());
    }
}
