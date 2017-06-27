/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peças;

import javax.swing.ImageIcon;

/**
 *
 * @author Charden
 */
public class Vazio extends Peças {

    Vazio() {

        this.visivel = true;
        this.nome = "Vazio";
        this.movel = true;
        this.nivel = 0;
        this.imagem = new ImageIcon("Vazio.png");
    }
}
