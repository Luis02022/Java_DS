/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.for_repeticao;
import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class ARRAY2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        
        for (int i = 0; i < 2; i++){
            System.out.println("Digite a " + (i+1) + " nota: " );
            notas[i] = ler.nextDouble();
            
            System.out.println("\n||EXIBINDO NOTAS||");
            for(double nota: notas){
                System.out.println("Nota: " + nota);
            }
        }
        
        
        
    }
}
