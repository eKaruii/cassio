/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
public class Conta {
    Cliente titular;
    int numero;
    double limite = 1000.0, saldo;
    
    void Sacar(double valor) {
        saldo = saldo - valor;
    }
    
    void Depositar (double valor)
    {
        saldo = saldo + valor;
    }
}
