/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola3;

/**
 *
 * @author selma
 */
public class Funcionario extends Pessoa {
    
    int RGM;
    String cargo;
    
    Funcionario(String nome, String cpf, String dtNasc, int RGM, String cargo) {
        super(nome, cpf, dtNasc);
        this.RGM = RGM;
        this.cargo = cargo;
               
    }
    
}
