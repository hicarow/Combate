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
public class Cabo_armeiro extends Peças implements Mover{
    
    private int nível;
    Cabo_armeiro(){
        
        this.nome="Cabo armeiro";
        this.móvel=true;
        this.nível=3;
            
    }
    void mover(int x, int y){
        
    };
}
