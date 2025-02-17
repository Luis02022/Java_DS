/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author aluno.den
 */
public class Main {
    public static void main(String[] args) {
         // Cliente cliente = new Cliente();
    
         // Cliente.nome = "Marta";
         // System.out.println("Nome: " + cliente.nome);
         
      Cliente cliente = new Cliente("Luis", "luis.f@gmail.com", 19);
      
      cliente.setIdade(50);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade() + " anos");
        System.out.println("E-mail: " + cliente.getEmail());
      
      
    }
    
}
