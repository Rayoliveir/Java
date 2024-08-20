/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_prestacaoservico;

/**
 *
 * @author Marcelly
 */
public class Cliente_class extends Fisica_class_abstract {
    String protocoloAtendimento;

    public Cliente_class(String protocoloAtendimento, Sexo_enum sexo, Estado_Civil_enum estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco_class endereco) {
        super(sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\n== DADOS PESSOA FISICA ==" +
                super.toString() +
               "\n\nProtocolo Atendimento: " + protocoloAtendimento;
    }
    
    
}
