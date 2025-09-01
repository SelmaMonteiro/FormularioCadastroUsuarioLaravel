/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escola3;

/**
 *
 * @author selma
 */
public class Escola3 {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Palloma", "12345", "01/11", 123, "DS");
        
        System.out.println("Nome do aluno: " + aluno1.nome +
                           "  cpf: " + aluno1.cpf +
                           "  dtNasc: " + aluno1.dtNasc + 
                           "  RA: " + aluno1.RA +
                           "  curso: " + aluno1.curso);
    }
}
