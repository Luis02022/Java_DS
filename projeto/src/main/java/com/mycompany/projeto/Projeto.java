/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;
import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Projeto {

    public static void main(String[] args) {
        String nome_aluno;
        float nota1, nota2, media = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do Aluno:");
        nome_aluno = ler.nextLine();
                
        System.out.println("Digite sua primeira nota:");
        nota1 = ler.nextFloat();
        
        System.out.println("Digite sua segunda nota:");
        nota2 = ler.nextFloat();
        
       
        media = (nota1 + nota2) / 2;
        
        System.out.println("Nome do Aluno: "+nome_aluno);
        System.out.println("Média =" +media);
        
        
        if(media < 7){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Aprovado");
        }
    }
}
