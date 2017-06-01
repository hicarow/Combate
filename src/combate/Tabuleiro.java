/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate;

import Peças.Peças;

/**
 *
 * @author Charden
 */
public class Tabuleiro {
    private int i,j;
    private String nome;
    
    
    static void posicionaLago(){
        
        
        
    }
    
    Tabuleiro(){
        Peças Tabuleiro[][] = new Peças[5][5];
        
            for(i=0;i<5;i++){           
                for(j=0;j<5;j++){
                
                Tabuleiro[i][j] = new Marechal();
                
            }
        }
        
    }
    Tabuleiro(int i, int j, Peças Peça){
        Peças Tabuleiro[][] = new Peças[5][5];
        
            for(i=0;i<5;i++){           
                for(j=0;j<5;j++){
                

                Tabuleiro[i][j] = new;
                
                }
            }
    }
}
