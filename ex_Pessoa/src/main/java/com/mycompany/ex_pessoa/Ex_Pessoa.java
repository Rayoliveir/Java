/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_pessoa;

/**
 *
 * @author Marcelly
 */
public class Ex_Pessoa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(56, "Marcos", 19, "71 9 9999-9999", "mrcos@gmail.com", Sexo.MASCULINO, 
                new Endereco("Avenida Jorge Almeida", "98", "1º andar", "55900-000", "Xique-xique", UnidadeFederativa.BAHIA));
        Pessoa pessoa2 = new Pessoa(88, "Maria", 25, "7199999-9999", "mariazinha@gmail.com", Sexo.FEMININO, new Endereco("Rua Jacaré corrido", "55", "N/A", "48200-000", "Copacabana", UnidadeFederativa.RIO_DE_JANEIRO));
        //Pessoa pessoa = new Pessoa(0, nome, 0, telefone, email, Sexo.FEMININO, new Endereco(longradouro, numero, complemento, cep, cidade, UnidadeFederativa.BAHIA));
        
        
        System.out.println("*== Primeira Pessoa ==*");
        System.out.println("ID: " + pessoa1.getId());
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("E-mail: " + pessoa1.getEmail());
        System.out.println("Sexo: " + pessoa1.getSexo().getTexto());
        System.out.println("Endereço: " + pessoa1.getEndereco().getLongradouro());
        System.out.println("Endereço: " + pessoa1.getEndereco().getNumero());
        System.out.println("Endereço: " + pessoa1.getEndereco().getComplemento());
        System.out.println("Endereço: " + pessoa1.getEndereco().getCep());
        System.out.println("Endereço: " + pessoa1.getEndereco().getCidade());
        System.out.println("Endereço: " + pessoa1.getEndereco().getUf().getNome());
        System.out.println("Endereço: " + pessoa1.getEndereco().getUf().getSigla());
        
        System.out.println("\n");
        
        System.out.println("*== Pessoa ==*");
        System.out.println("ID: " + pessoa2.getId());
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        System.out.println("E-mail: " + pessoa2.getEmail());
        System.out.println("Sexo: " + pessoa2.getSexo().getTexto());
        System.out.println("Endereço: " + pessoa2.getEndereco().getLongradouro());
        System.out.println("Endereço: " + pessoa2.getEndereco().getNumero());
        System.out.println("Endereço: " + pessoa2.getEndereco().getComplemento());
        System.out.println("Endereço: " + pessoa2.getEndereco().getCep());
        System.out.println("Endereço: " + pessoa2.getEndereco().getCidade());
        System.out.println("Endereço: " + pessoa2.getEndereco().getUf().getNome());
        System.out.println("Endereço: " + pessoa2.getEndereco().getUf().getSigla());
    }
}
