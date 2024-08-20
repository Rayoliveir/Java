/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_prestacaoservico;

/**
 *
 * @author Marcelly
 */
public class PrestacaoServico_class extends Juridica_class_abstract {
    String contratoInicio;
    String contratoFim;

    public PrestacaoServico_class(String contratoInicio, String contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco_class endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }


    @Override
    public String toString() {
        return "\n\n== DADOS PESSOA JURIDICA ==" +
                super.toString() +
               "\n\nContrato Inicio: " + contratoInicio + 
               "\nContrato Fim: " + contratoFim;
    }

    
}
