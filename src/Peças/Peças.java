package Peças;

import javax.swing.ImageIcon;

public abstract class Peças {

    protected boolean CPU;
    protected int time;
    protected String nome;
    protected boolean visivel;
    protected boolean movel;
    protected int nivel;

    protected ImageIcon imagem;   //alterar depois
    protected ImageIcon imagem1;
    protected ImageIcon imagem2;

    public boolean getCPU(){
        return this.CPU;
    }
    public void setCPU(boolean nvalor){
        this.CPU=nvalor;
    }
    public int getTime() {
        return this.time;
    }
    public void setTime(int novovalor) {
        this.time = novovalor;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String novonome) {
        this.nome = novonome;
    }
    public boolean getVisivel() {
        return this.visivel;
    }
    public void setVisivel(boolean novovalor) {
        this.visivel = novovalor;
    }
    public int getNivel() {
        return this.nivel;
    }
    public ImageIcon getImagem() {
        return this.imagem;
    }
    public void setImagem(boolean visivel, boolean CPU){
        
    }

    public boolean mover(int x, int x2, int y, int y2) {
        if (validaMovimento(x, x2, y, y2)) {
            if (x == x2) {
                if (Math.pow(y - y2, 2) != 1) {
                    return false;
                } else {
                    return true;
                }
            } else if (y == y2) {
                if (Math.pow(x - x2, 2) != 1) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    protected boolean validaMovimento(int x1, int y1, int x2, int y2) {
        if (Tabuleiro.matriz[x2][y2].time == 3) {
            return false;
        } else if (this.time == Tabuleiro.matriz[x2][y2].time) {
            return false;
        } else {
            return true;
        }
    }

    protected boolean Batalha(int x, int y, int x2, int y2) {
        if (Tabuleiro.matriz[x2][y2].nivel == 100) {
            return true;
        } else if (Tabuleiro.matriz[x2][y2].nivel == 99) {
            if (this.nivel == 3) {
                Tabuleiro.matriz[x2][y2] = this;
                Tabuleiro.matriz[x][y] = new Vazio();
                Tabuleiro.matriz[x2][y2].setVisivel(true);
            } else {
                Tabuleiro.matriz[x][y] = new Vazio();
                Tabuleiro.matriz[x2][y2].setVisivel(true);
            }
        } else if (this.nivel == 1 && Tabuleiro.matriz[x2][y2].nivel == 10) {
            Tabuleiro.matriz[x2][y2] = this;
            Tabuleiro.matriz[x][y] = new Vazio();
            this.setVisivel(true);
        } else if (this.nivel > Tabuleiro.matriz[x2][y2].nivel) {
            Tabuleiro.matriz[x2][y2] = this;
            Tabuleiro.matriz[x][y] = new Vazio();
            this.setVisivel(true);
        } else if (this.nivel < Tabuleiro.matriz[x2][y2].nivel) {
            Tabuleiro.matriz[x][y] = new Vazio();
            Tabuleiro.matriz[x2][y2].setVisivel(true);
        } else if (this.nivel == Tabuleiro.matriz[x2][y2].nivel) {
            Tabuleiro.matriz[x2][y2] = new Vazio();
            Tabuleiro.matriz[x][y] = new Vazio();
        }
        return false;
    }
}
