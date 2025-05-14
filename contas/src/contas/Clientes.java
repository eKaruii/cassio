/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab08
 */
public class Clientes {
    private String nome;
    private String Cpf;
    private List<Conta> contas=new ArrayList<>();
    
    
    public void AddConta(Conta conta){
        contas.add(conta);
        
    }
    
    public void CriarConta(double saldo, int tipo){
        //poupança
        if (tipo == 0){
            Conta pp = new ContaPo(saldo); 
        }
        // corrente
        else if (tipo == 1){
            Conta C2 = new ContaCo(saldo);
        }
        
    }
    
    
    
    
}
