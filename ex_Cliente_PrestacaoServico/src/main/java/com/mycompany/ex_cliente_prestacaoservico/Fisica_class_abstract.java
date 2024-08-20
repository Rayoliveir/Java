/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cliente_prestacaoservico;

/**
 *
 * @author Marcelly
 */
public abstract class Fisica_class_abstract extends Pessoa_class_abstract {
    Sexo_enum sexo;
    Estado_Civil_enum estadoCivil;
    String dataNascimento;

    public Fisica_class_abstract(Sexo_enum sexo, Estado_Civil_enum estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco_class endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public Sexo_enum getSexo() {
        return sexo;
    }

    public void setSexo(Sexo_enum sexo) {
        this.sexo = sexo;
    }

    public Estado_Civil_enum getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Estado_Civil_enum estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSexo: " + sexo + 
               "\nEstado Civil: " + estadoCivil + 
               "\nData Nascimento: " + dataNascimento;
    }
    
    
}
