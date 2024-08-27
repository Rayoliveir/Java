/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_cargoconfiancafuncionario;

/**
 *
 * @author aluno.den
 */
public class Ex_CargoConfiancaFuncionario {

    public static void main(String[] args) {
        Motorista motorista = new Motorista("carteiraHabilitacao", "nome", "cpf", "rg", new Endereco("longradouro", "numero", "complemento", "cep", "cidade", UnidadeFederativa.BAHIA), Setor.MARKETING, Sexo.FEMININO, 5000.00, "dataNascimento");
        Advogado advogado = new Advogado("oab", "nome", "cpf", "rg", new Endereco("longradouro", "numero", "complemento", "cep", "cidade", UnidadeFederativa.BAHIA), Setor.MARKETING, Sexo.FEMININO, 2000.00, "dataNascimento");
        Gerente gerente = new Gerente(Bonificacao.DIRETOR, "nome", "cpf", "rg", new Endereco("longradouro", "numero", "complemento", "cep", "cidade", UnidadeFederativa.BAHIA), Setor.MARKETING, Sexo.FEMININO, 7000.00, "dataNascimento");
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "nome", "cpf", "rg", new Endereco("longradouro", "numero", "complemento", "cep", "cidade", UnidadeFederativa.BAHIA), Setor.MARKETING, Sexo.FEMININO, 8000.00, "dataNascimento");
        
                
        System.out.println(motorista.toString());
        System.out.println(diretor.toString());
        System.out.println(gerente.toString());
        System.out.println(advogado.toString());
        
        diretor.admitir(advogado);
        diretor.demitir(motorista);
    }
}
