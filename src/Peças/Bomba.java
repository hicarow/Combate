package Peças;

import javax.swing.ImageIcon;

public class Bomba extends Peças {

    public Bomba() {
        this.visivel = false;
        this.nome = "Bomba";
        this.movel = false;
        this.nivel = 99;
    }

    public void setImagem() {

        if (this.visivel == true && this.CPU == false) {
            this.imagem = new ImageIcon("BombaJogador.png");
        } else if (this.visivel == true && this.CPU == true) {
            this.imagem = new ImageIcon("BombaCPU.png");
        } else {
            this.imagem = new ImageIcon("Desconhecido.png");
        }
    }

}
