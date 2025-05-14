/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author alunolab08
 */
public class ContaCo extends Conta{
    
    public ContaCo(double saldo) {
        super(saldo);
    }
    
    @Override
    public void Sacar(double s){
        setSaldo(getSaldo() - (s + 5));
        
    }
    
    @Override
    public void AplicarRendimento(double s){
         setSaldo(getSaldo()*1.005);
        
    }
    
    
}
