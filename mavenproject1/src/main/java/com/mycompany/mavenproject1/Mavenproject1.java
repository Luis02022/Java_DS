/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        float valor_produto;
        int prestacao = 5;
        float total_parcelar;
        
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto adquirido: R$");
        valor_produto = valor.nextFloat();
        
        total_parcelar = valor_produto / prestacao;
        
        System.out.println("Você terá que pagar 5 parcelas de R$" + total_parcelar);
        
    }
}
