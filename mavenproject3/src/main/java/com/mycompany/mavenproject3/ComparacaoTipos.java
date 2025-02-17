/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author aluno.den
 */
public class ComparacaoTipos {
    public static void main(String[] args) {
        //Declaração de variáveis
        String nomeUsuario = "Marta";
        int senha = 123;
        
        // Comparação de Strings e inteiros 
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 123);
        
        //Exbindo resultados
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correto? " + resultadoSenha);
    }
    
}
