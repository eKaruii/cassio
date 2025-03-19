/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula20250212;

import java.util.Scanner;

/**
 *
 * @author alunolab08
 */
public class Aula20250212 {

    public static void main(String[] args) {
        //Versão 1.0 - Apenas imprime.
        //**********************************************************************
        /*
        System.out.printf("=======================================\n");
        System.out.printf("\t\t %s \n", "CALCULADORA");
        System.out.printf("=======================================\n");
        System.out.println("\t[1] Adição (+)");
        System.out.println("\t[2] Subtração (-)");
        System.out.println("\t[3] Multiplicação (*)");
        System.out.println("\t[4] Divisão (/)");
        System.out.println("\t[0] Sair");
        System.out.printf("=======================================\n");
        System.out.printf("Escolha uma opção: \n");
        */
        
        //Versão 2.0 - Recebendo a digitação.
        //**********************************************************************
        /*
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.printf("=======================================\n");
        System.out.printf("\t\t %s \n", "CALCULADORA");
        System.out.printf("=======================================\n");
        System.out.println("\t[1] Adição (+)");
        System.out.println("\t[2] Subtração (-)");
        System.out.println("\t[3] Multiplicação (*)");
        System.out.println("\t[4] Divisão (/)");
        System.out.println("\t[0] Sair");
        System.out.printf("=======================================\n");
        System.out.printf("Escolha uma opção: \n");
        
        opcao = scanner.nextInt(); // Captura a opção digitada pelo usuário
        System.out.printf("Opção escolhida foi: %d \n", opcao);
        
        scanner.close();
        */
        
        //Versão 3.0 - Validando a digitação (IF). Destacando o ELSEIF
        //**********************************************************************
        /*
        */
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while(opcao != 0){
            System.out.printf("=======================================\n");
            System.out.printf("\t\t %s \n", "CALCULADORA");
            System.out.printf("=======================================\n");
            System.out.println("\t[1] Adição (+)");
            System.out.println("\t[2] Subtração (-)");
            System.out.println("\t[3] Multiplicação (*)");
            System.out.println("\t[4] Divisão (/)");
            System.out.println("\t[0] Sair");
            System.out.printf("=======================================\n");
            System.out.printf("Escolha uma opção: ");

            opcao = scanner.nextInt(); // Captura a opção digitada pelo usuário


            switch(opcao){
                case 0:
                    System.out.println("Saindo....");
                    break;
                case 1:
                    System.out.println("Adição selecionada");
                    break; 
                case 2:
                    System.out.println("Subtração selecionada");
                    break;
                case 3:
                    System.out.println("Multiplicação selecionada");
                    break;
                case 4:
                    System.out.println("Divisão selecionada");
                    break;
                default:
                     System.out.println("Opção inválida! Digite um número entre 0 e 4.");
                    break;
            }
        }
        
        
        scanner.close();
        
        
    }
}
