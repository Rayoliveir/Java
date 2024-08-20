/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_cliente_prestacaoservico;

/**
 *
 * @author Marcelly
 */
public class Ex_Cliente_PrestacaoServico {

    public static void main(String[] args) {
        Cliente_class cliente = new Cliente_class("110420241464", Sexo_enum.FEMININO, Estado_Civil_enum.SOLTEIRO, "12032005", "Maria Joana", "7199999-9999", "mariajoana@gmail.com", 
                new Endereco_class("Rua 1", "99", "Casa 10", "99.876-000", "Salvador", UnidadeFederativa_enum.BAHIA));
        
        PrestacaoServico_class prestacaoServico = new PrestacaoServico_class("22102010", "22102015", "12.345.678/0001-00", "123.456.789.000", "MWM enterprise", "7199999-9999", "mwmenterprise@gmail.com", 
                new Endereco_class("Avenida 7", "77b", "sala 5", "12.345-000", "São paulo", UnidadeFederativa_enum.SAO_PAULO));
        
        System.out.println(cliente);
        System.out.println(prestacaoServico);



    }
}
