/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author alunolab08
 */
public class ContaPo extends Conta {

    public ContaPo(double saldo) {
        super(saldo);
    }
    
    
    @Override
    public void Sacar(double s){
        setSaldo(getSaldo() - (s + 15));
        
    }
    
    @Override
    public void AplicarRendimento(double s){
         setSaldo(getSaldo()*1.012);
        
    }
    
    
}
