package Peças;

import javax.swing.ImageIcon;

public class Espião extends Peças {

    public Espião() {

        this.nome = "Espião";
        this.nivel = 1;
        this.movel = true;
    }

    public void setImagem(boolean visivel, boolean CPU) {

    if(visivel==true&&CPU==false)
        this.imagem = new ImageIcon("EspiaoJogador.png");
    else if(visivel==true&&CPU==true)
        this.imagem = new ImageIcon("EspiaoCPU.png");
    else
        this.imagem = new ImageIcon("Desconhecido.png");
    }
}
