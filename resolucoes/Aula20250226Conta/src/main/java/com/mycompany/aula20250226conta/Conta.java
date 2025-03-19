package com.mycompany.aula20250226conta;

public class Conta {
    int numero;
    String nome;
    double limite;
    double saldo;
    
    void Imprimir(){
        System.out.println("------");
        System.out.println(nome);
        System.out.println("Numero: "+numero);
        System.out.println("Limite: "+limite);
        System.out.println("Saldo: "+saldo);
        System.out.println("------");
    }
    
    void Depositar(double v){
        saldo += v;
    }
    
    boolean Sacar(double v){
        if(saldo < v){
            System.out.println("Saldo insuficiente.");
            return false;
        }
        saldo -= v;
        return true;
    }
    
}
