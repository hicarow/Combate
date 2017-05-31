/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peças;

/**
 *
 * @author Charden
 */
      
abstract public class Peças{
    
    private String nome;
    private boolean visível;
    private boolean móvel;
    
    public String getNome(){
        return this.nome;       
    }
            
    public void setNome(String novonome){
        this.nome = novonome;
    }
    
    public boolean getVisível(){
        return visível;
    }
    public void setVisível(boolean novovalor){
        visível = novovalor;
    }
        

    private batalha(){
        
        if(this.nível)
            
         this.setVisível(true);
    }
    
}