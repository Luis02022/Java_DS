/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.for_repeticao;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Array_Exerc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;
        
        
        do{
            System.out.println("Digite uma nota:");
            notas.add(ler.nextDouble());
                    
            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("\nPressione a tecla N para sair.");
            resposta = ler.next();
                    
        }while(!resposta.equalsIgnoreCase("n"));
       
        System.out.println("\n||EXIBINDO DADOS||");
        for(double nota: notas){
            System.out.println("Nota: "+ nota);
        }
        
        
    }
}
