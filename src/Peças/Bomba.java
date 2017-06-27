package Peças;

import javax.swing.ImageIcon;

public class Bomba extends Peças {

    public Bomba() {
        this.visivel = false;
        this.nome = "Bomba";
        this.movel = false;
        this.nivel = 99;
    }

    public void setImagem(boolean visivel, boolean CPU) {

        if (visivel == true && CPU == false) {
            this.imagem = new ImageIcon("BombaJogador.png");
        } else if (visivel == true && CPU == true) {
            this.imagem = new ImageIcon("BombaCPU.png");
        } else {
            this.imagem = new ImageIcon("Desconhecido.png");
        }
    }

}
