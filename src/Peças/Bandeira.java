package Peças;

import javax.swing.ImageIcon;

public class Bandeira extends Peças {

    public Bandeira() {
        this.visivel = false;
        this.nome = "Bandeira";
        this.movel = false;
        this.nivel = 100;
    }

    public void setImagem(boolean visivel, boolean CPU) {

        if (visivel == true && CPU == false) {
            this.imagem = new ImageIcon("BandeiraJogador.png");
        } else if (visivel == true && CPU == true) {
            this.imagem = new ImageIcon("BandeiraCPU.png");
        } else {
            this.imagem = new ImageIcon("Desconhecido.png");
        }
    }

}
