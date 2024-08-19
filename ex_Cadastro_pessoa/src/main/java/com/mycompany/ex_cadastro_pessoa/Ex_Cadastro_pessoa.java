/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_cadastro_pessoa;

import java.time.LocalDate;

/**
 *
 * @author aluno.den
 */
public class Ex_Cadastro_pessoa {

    public static void main(String[] args) {
        class_Pessoa_Fisica pessoaFisica = new class_Pessoa_Fisica(enum_Sexo.FEMININO, "123.456.789-00", "12.345.678-00", "10/02/2013", 50000, 55, "Marcos", "71 99999-9999", 
                new class_Endereco("Senhor do bomfim", "002", "casa 1", "47400-000","Xique-xique" , enum_Unidade_Federativa.BAHIA));
        
        class_Pessoa_Juridica pessoaJuridica = new class_Pessoa_Juridica(enum_Sexo.FEMININO, "12.345.678/0001-00", "388.108.598.269", "22/05/2010", "22/05/2025", 1000000, 99, "Jorge Araújo", "71 9 9999-9999", 
                new class_Endereco("copacabana", "577", "AP 35", "22070012", "zona sul", enum_Unidade_Federativa.RIO_DE_JANEIRO));
        
        
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
    }
}
