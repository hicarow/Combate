package Peças;

import javax.swing.ImageIcon;

public class Cabo extends Peças {

    public Cabo() {

        this.nome = "Cabo";
        this.movel = true;
        this.nivel = 3;

    }

    public void setImagem() {

        if (this.visivel == true && this.CPU == false) {
            this.imagem = new ImageIcon("CaboJogador.png");
        } else if (this.visivel == true && this.CPU == true) {
            this.imagem = new ImageIcon("CaboCPU.png");
        } else {
            this.imagem = new ImageIcon("Desconhecido.png");
        }

    }

}
