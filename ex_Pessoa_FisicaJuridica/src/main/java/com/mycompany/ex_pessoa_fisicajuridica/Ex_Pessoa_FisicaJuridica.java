/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_pessoa_fisicajuridica;

/**
 *
 * @author Marcelly
 */
public class Ex_Pessoa_FisicaJuridica {

    public static void main(String[] args) {
        Fisica fisica = new Fisica("123.456.789-00", "12.345.678-00", "25/11/2010");
        Juridica juridica = new Juridica("12.345.678/0001-00", "123.456.789.000");

        System.out.println(fisica.toString());
        System.out.println(juridica.toString());

    }
}
