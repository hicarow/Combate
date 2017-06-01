/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combate;

import Peças.Lago;
import Peças.Marechal;
import java.util.Random;
import Peças.Peças;


/**
 *
 * @author Charden
 */
public class Tabuleiro {
    
    static int i,j;
    Peças Tabuleiro[][] = new Peças[5][5];
    
    
    public void posicionaLago(){
        
        Random aleatorio = new Random();
        i = aleatorio.nextInt(6);
                
        Tabuleiro[i][3] = new Lago();
        
    }
    
    Tabuleiro(){
        
            for(i=0;i<5;i++){           
                for(j=0;j<5;j++){
                
                Tabuleiro[i][j] = new Marechal();
                
            }
        }
        
    }
    Tabuleiro(int i, int j, Peças Peça){
        
            for(i=0;i<5;i++){           
                for(j=0;j<5;j++){
                

                
                }
            }
    }
}
