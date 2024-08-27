/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_contratacaomotoboy;

/**
 *
 * @author aluno.den
 */
public class Ex_ContratacaoMotoboy {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("1234567890", "Manoel", "13021998", Sexo.FEMININO, Setor.OPERACOES, 2000);
        Diretor diretor = new Diretor("mACOS", "dataNascimento", Sexo.FEMININO, Setor.OPERACOES, 5000);
        
        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());

        diretor.demitir(motoboy);
    }
}
