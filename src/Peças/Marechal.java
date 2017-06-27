package Peças;

import javax.swing.ImageIcon;

public class Marechal extends Peças{
    
    
    public Marechal(){
        
        this.nome="Marechal";
        this.movel=true;
        this.nivel=10;
    }
    public void setImagem(boolean visivel, boolean CPU){

        if (visivel == true && CPU == false) {
            this.imagem = new ImageIcon("MarechalJogador.png");
        } else if (visivel == true && CPU == true) {
            this.imagem = new ImageIcon("MarechalCPU.png");
        } else {
            this.imagem2 = new ImageIcon("Desconhecido.png");
        }
    }

}
