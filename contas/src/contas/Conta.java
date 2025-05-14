/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author alunolab08
 */
public class Conta {
    private double saldo;

    public Conta(double saldo){
        this.saldo=saldo;
        
        
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(double s){
        this.saldo= this.saldo + s;
        
    }    
    
    
    
    
    
    
    public void Sacar(double s){
        this.saldo= this.saldo - s;
        
    }
    

    
    public void AplicarRendimento(double s){
        
    }

    
    
    
   
}
