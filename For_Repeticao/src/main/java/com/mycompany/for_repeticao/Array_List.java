/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.for_repeticao;
import java.util.ArrayList;
/**
 *
 * @author aluno.den
 */
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        
        notas.add(10.0);
        notas.add(8.0);
        
        
        for (double nota: notas){
            System.out.println("Nota: " + nota);
             
        }
        
    }
}
