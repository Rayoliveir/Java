/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_conta_bancaria_funcionario;

/**
 *
 * @author Marcelly
 */
public class Conta_Bnacaria {

    private String banco;
    private String agencia;
    private String numero_conta;
    private String tipo_conta;
    private double saldo_atual;
    private double limite_disponivel;

    public Conta_Bnacaria(String banco, String agencia, String numero_conta, String tipo_conta, double saldo_atual, double limite_disponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero_conta = numero_conta;
        this.tipo_conta = tipo_conta;
        this.saldo_atual = saldo_atual;
        this.limite_disponivel = limite_disponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public double getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(double saldo_atual) {
        this.saldo_atual = saldo_atual;
    }

    public double getLimite_disponivel() {
        return limite_disponivel;
    }

    public void setLimite_disponivel(double limite_disponivel) {
        this.limite_disponivel = limite_disponivel;
    }

    
}