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
public class Espião extends Peças implements Mover {
    
    protected int nível;
    
    public Espião(){
        
        this.nome="Espião";
        this.nível = 1;
        this.móvel = true;
    }
    
    
    void mover(int x, int y){
        
    };
}
