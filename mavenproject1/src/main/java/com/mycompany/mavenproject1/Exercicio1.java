/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        double valor = teclado.nextDouble();
        
        double prestacao = valor / 5;

        System.out.println("Prestações: " + prestacao);
    }
    
}
