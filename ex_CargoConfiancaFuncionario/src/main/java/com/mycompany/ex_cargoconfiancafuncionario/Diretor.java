/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_cargoconfiancafuncionario;

/**
 *
 * @author aluno.den
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double PREMIO = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = (super.salario * PREMIO) + (super.salario * bonificacao.getValor());
        salarioFinal += super.salario;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\n\n=== ADIMITINDO FUNCIONARIO  ===");
        System.out.println("-+- DADOS DO FUNCIONARIO -+-");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\n\n=== DEMITINDO FUNCIONARIO  ===");
        System.out.println("-+- DADOS DO FUNCIONARIO -+-");
        System.out.println(funcionario.toString());
    }

    @Override
    public String toString() {
        return "\n== DIRETOR ==" + 
                super.toString() +
               "\nPremio: " + PREMIO;
    }

    
    
}
