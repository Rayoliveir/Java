/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_prestacaoservico;

/**
 *
 * @author Marcelly
 */
public class Endereco_class {
    String longradouro;
    String numero;
    String complemento;
    String cep;
    String cidade;
    UnidadeFederativa_enum uf;

    public Endereco_class(String longradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa_enum uf) {
        this.longradouro = longradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return //"\n- Endereco -" + 
               "\nLongradouro: " + longradouro + 
               "\nNumero: " + numero + 
               "\nComplemento: " + complemento + 
               "\nCep: " + cep + 
               "\nCidade: " + cidade + 
               "\nUF: " + uf;
    }

    
    
}
