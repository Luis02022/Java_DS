/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author aluno.den
 */
public class NewClass {
    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";
                
        //Exibindo a quantidade de caracteres 
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        // Exibindo nome completo usando métodos Strings - Maiúsculas
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        
        // Exibindo nome completo usando métodos Strings - Minúsculas
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}
