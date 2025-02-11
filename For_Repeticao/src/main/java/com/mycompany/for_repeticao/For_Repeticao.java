/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for_repeticao;
import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class For_Repeticao {
    
    public static void main(String[] args) {
        float nota1, nota2, soma = 0, media = 0;
        int i;
        Scanner ler = new Scanner(System.in);
        
        
       do{
           
            System.out.println("Digite sua 1ª nota: ");
            nota1 = ler.nextFloat();
            
           
            
       }while(nota1 > 0 || nota1 <= 10);
       
       
       do{
           
            System.out.println("Digite sua 2ª nota: ");
            nota2 = ler.nextFloat();
            
           
            
       }while(nota2 > 0 || nota2 <= 10);
       
       soma = nota1 + nota2;
       
       media = soma / 2;
       
        System.out.println("\n||EXIBINDO DADOS||");
       System.out.println("Média: " + media);
       
       if(media > 7){
           System.out.println("Aprovado");
       }
       else{
           System.out.println("Reprovado");
       }
       
        
       
       
    }
    
    
           
}
