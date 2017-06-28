package Peças;

import javax.swing.ImageIcon;

public class Marechal extends Peças{
    
    
    public Marechal(){
        
        this.nome="Marechal";
        this.movel=true;
        this.nivel=10;
    }
    public void setImagem(){

        if (this.visivel == true && this.CPU == false) {
            this.imagem = new ImageIcon("MarechalJogador.png");
        } else if (this.visivel == true && this.CPU == true) {
            this.imagem = new ImageIcon("MarechalCPU.png");
        } else {
            this.imagem = new ImageIcon("Desconhecido.png");
        }
    }

}
