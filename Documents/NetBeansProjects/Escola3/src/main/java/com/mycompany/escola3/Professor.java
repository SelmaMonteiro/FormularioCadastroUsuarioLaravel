/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola3;

/**
 *
 * @author selma
 */
public class Professor extends Pessoa {
    int RF;
    String disciplina;
    
    Professor(String nome, String cpf, String dtNasc, int RF, String disciplina) {
        super(nome, cpf, dtNasc);
        this.RF = RF;
        this.disciplina = disciplina;
    }
    
}
