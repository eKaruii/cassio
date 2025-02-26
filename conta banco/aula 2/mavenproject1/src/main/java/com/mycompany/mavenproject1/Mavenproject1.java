/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author alunolab08
 */
public class Mavenproject1 {

    
    public static void main(String[] arg){
        int opcao; 
        double valor = 0, total = 0;
        Conta c = new Conta();
        
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Qual o numero da conta?");
        c.numero = scan.nextInt();
        
        System.out.println("Qual o nome do titular da conta?");
        c.nome = scan.next();
        
        System.out.println("Qual o limite da conta?");
        c.limite = scan.nextDouble();
        total = c.limite;
        
        System.out.println("Qual o saldo da conta?");
        c.saldo = scan.nextDouble();
        
        do
        {
            System.out.println(" ");
	    System.out.println("====================================");
	    System.out.printf("\t\tMENU \n");
            System.out.println("[1] Sacar");
            System.out.println("[2] Depossitar");		
            System.out.println("[0] SAIR");
            System.out.println("====================================");
            System.out.println("Escolha uma opção:");
            
            opcao = scan.nextInt();
            
            if (opcao != 0){
                System.out.println(" ");
                System.out.println("====================================");	
                System.out.println("Qual valor deseja sacar/depositar");
                System.out.println("====================================");
                System.out.println("Escolha valor:");
            }
            
            
            valor = scan.nextDouble();
            
            switch(opcao)
            {
                case 0:
                    System.out.println("Saindo...");
                case 1:
                    total= total - valor;
                    if (total >= 0){
                        c.Sacar(valor);
                        System.out.println("valor sacado: " +valor);
                        System.out.println("Saldo atual: "+c.saldo);
                        System.out.println("Limite disponivel: "+total);
                    } 
                    else{
                        System.out.println("Limite de saque alcançado");
                        System.out.println("Limite disponivel: "+total);
                    }
                    break;
                case 2:
                    c.Depositar(valor);
                    System.out.println("valor depositado: " +valor);
                    System.out.println("Saldo atual: "+c.saldo);
                    break;
                    
            }
        }
        while (opcao != 0);
                
        
    }
}
