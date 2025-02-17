/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Exercicio {
    public static void main(String[] args) {
        String login, loginCadastrado = "Luis";
        String senha, senhaCadastrada = "4002";
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu login: ");
        login = ler.nextLine();
        
        System.out.println("Digite sua senha: ");
        senha = ler.nextLine();            
       
        if (login.equals(loginCadastrado) && senha.equals(senhaCadastrada)){
        System.out.println("Bem Vindo");
               
    }else{
            System.out.println("Nome do usuário ou senha inválido");
        }
        
                
                
    }
}
