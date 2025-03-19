package com.mycompany.aula20250226conta;

public class Aula20250226Conta {

    public static void main(String[] args) {
        System.out.println("BANCO");
        
        Conta c1, c2;
        c1 = new Conta();
        c2 = new Conta();
        
        c1.numero = 1;
        c1.nome = "Cassio";
        c1.limite = 1000;
        c1.saldo = 10000;
        
        c2.numero = 2;
        c2.nome = "Pedro";
        c2.limite = 2000;
        c2.saldo = 20000;
                
        c1.Imprimir();
        
        c1.Depositar(22);
        c1.Sacar(35);  
        c1.Depositar(13);
        c1.Sacar(50);
        
        c1.Imprimir();
        
        
    }
}
