package Peças;

import javax.swing.ImageIcon;

public class Cabo extends Peças {

    private int nivel;

    public Cabo() {

        this.nome = "Cabo armeiro";
        this.movel = true;
        this.nivel = 3;

    }

    public void setImagem(boolean visivel, boolean CPU) {

        if (visivel == true && CPU == false) {
            this.imagem = new ImageIcon("CaboJogador.png");
        } else if (visivel == true && CPU == true) {
            this.imagem = new ImageIcon("CaboCPU.png");
        } else {
            this.imagem = new ImageIcon("Desconhecido.png");
        }

    }

}
