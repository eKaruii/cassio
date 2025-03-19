/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

import java.util.Scanner;

/**
 *
 * @author alunolab08
 */
public class teste {

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
        System.out.printf("Escolha uma opção: ");
        
        opcao = scanner.nextInt(); // Captura a opção digitada pelo usuário

        // Validação da opção
        if (opcao == 0) {
            System.out.println("Saindo da calculadora... ");
        } else if (opcao >= 1 && opcao <= 4) {
            System.out.println("Opção válida! Você escolheu a opção: " + opcao);
        } else {
            System.out.println("Opção inválida! Digite um número entre 0 e 4.");
        }

        scanner.close();
        
        
    }
}

