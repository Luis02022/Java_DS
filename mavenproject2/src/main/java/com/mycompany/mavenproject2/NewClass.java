/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();
        
        while (idade < 18) {
            System.out.println("Acesso negado");
            System.out.println("Digite sua idade");
                idade = ler.nextInt();
                        
                       
        }
        System.out.println("Acesso Permitido");
        System.out.println("Carregando...");
                
        
    }
}
