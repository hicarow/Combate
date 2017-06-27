package Peças;

import javax.swing.ImageIcon;

public class Lago extends Peças{
    public Lago(){
        
        this.nivel = 11;
        this.visivel = true;
        this.nome = "Lago";
        this.movel = false;
        this.time = 2;
        this.imagem = new ImageIcon("Lago.png");
    } 
}
