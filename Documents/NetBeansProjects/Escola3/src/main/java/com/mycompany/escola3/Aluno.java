/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola3;

/**
 *
 * @author selma
 */
public class Aluno extends Pessoa {
    int RA;
    String curso;
    
    Aluno(String nome, String cpf, String dtNasc, int RA, String curso) {
        super(nome, cpf, dtNasc);
        this.RA = RA;
        this.curso = curso;
    }
    
}
