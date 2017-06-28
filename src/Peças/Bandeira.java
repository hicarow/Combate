package Peças;

import javax.swing.ImageIcon;

public class Bandeira extends Peças {

    public Bandeira() {
        this.visivel = false;
        this.nome = "Bandeira";
        this.movel = false;
        this.nivel = 100;
    }

    public void setImagem() {

        if (this.visivel == true && this.CPU == false) {
            this.imagem = new ImageIcon("BandeiraJogador.png");
        } else if (this.visivel == true && this.CPU == true) {
            this.imagem = new ImageIcon("BandeiraCPU.png");
        } else {
            this.imagem = new ImageIcon("Desconhecido.png");
        }
    
        
    }

}
