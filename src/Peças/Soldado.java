package Peças;

import javax.swing.ImageIcon;

public class Soldado extends Peças{
    
    public Soldado(){
        
        this.nome="Soldado";
        this.movel=true;
        this.nivel=2;
        
    }
    public void setImagem(boolean visivel, boolean CPU){
            if(visivel==true&&CPU==false)
                this.imagem = new ImageIcon("SoldadoJogador.png");
            else if(visivel==true&&CPU==true){
                this.imagem = new ImageIcon("SoldadoCPU.png");
             }
            else
                this.imagem = new ImageIcon("Desconhecido.png");
            
        }
        public boolean mover(int x1, int y1, int x2, int y2){
        int i, j;
        if(validaMover(x1, x2, y1, y2)){
            if(x1 == x2){
                if(y1 > y2){
                    for(i = (y1-1); i < (y2-1); i--){
                        if(Tabuleiro.matriz[x1][i].time != 0){
                            return false;
                        }
                    }
                    return true;
                }
                else if(y1 < y2){
                    for(i = (y1+1); i > (y2+1); i++){
                        if(Tabuleiro.matriz[x1][i].time != 0){
                            return false;
                        }
                    }
                    return true;
                }
                else
                    return false;
            }
            else if(y1 == y2){
                if(x1 > x2){
                    for(i = (x1-1); i < (x2-1); i--){
                        if(Tabuleiro.matriz[i][y1].time != 0){
                            return false;
                        }
                    }
                    return true;
                }
                else if(x1 < x2){
                    for(i = (y1+1); i < (y2+1); i++){
                        if(Tabuleiro.matriz[i][y1].time != 0){
                            return false;
                        }
                    }
                    return true;
                }
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
  
}
