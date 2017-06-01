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
public class Soldado extends Peças implements Mover {
    private int nível;
   
    Soldado(){
        
        this.nome="Soldado";
        this.móvel=true;
        this.nível=2;
        
    }
    
    void mover(int x, int y){
        
    };
}
