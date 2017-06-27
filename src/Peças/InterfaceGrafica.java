/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peças;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 *
 * @author Charden
 */
public class InterfaceGrafica extends JFrame implements ActionListener{
    
    int i, j, k, x, y, x2, y2, vencedor;
    boolean turnp, turnai, fim, pronto;
    JButton matrizbotao[][] = new JButton[5][5];
    Object[] options = {"OK"};
    JButton debug, sair;
    
    /*InterfaceGrafica(){
        super("Combate");
        
        Container tela = getContentPane();
        setSize(800,700);
        setLayout(null);
        
        fim = false;
                
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                this.matrizbotao[i][j] = new JButton();
                
                this.matrizbotao[i][j].setBounds(100*j, (100*i)+80, 100, 100);
                this.matrizbotao[i][j].addActionListener(this);
                
                
                tela.add(this.matrizbotao[i][j]);
                
            }
            
        }
        debug = new JButton("DEBUG");
        debug.setBounds(600, 380, 100, 42);
        debug.addActionListener(this);
        
        sair = new JButton("SAIR");
        sair.setBounds(600, 180, 100, 42);
        sair.addActionListener(this);
        
        tela.add(debug);
        tela.add(sair);
        
        AtualizaIcone();
        
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }  */      
     public void AtualizaIcone(){
        
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                
                if(Tabuleiro.matriz[i][j].visivel)
                this.matrizbotao[i][j].setIcon(Tabuleiro.matriz[i][j].imagem);
                else
                this.matrizbotao[i][j].setIcon(Tabuleiro.matriz[i][j].imagem2); 
            }
        }
    }
        
    
    @Override
    public void actionPerformed(ActionEvent evento){
        
        vencedor = 0;
        fim = false;
        AtualizaIcone();

        if(pronto){
            
            AtualizaIcone();
        
            for(i = 0; i < 5; i++){
                for(j = 0; j < 5; j++){
                    if(evento.getSource() == matrizbotao[i][j]){
                        if(Tabuleiro.matriz[i][j].time == 1){
                            if(Tabuleiro.ValidaOrigem(i, j, 1)){
                                x = i;
                                y = j;
                                turnp = false;
                            }
                        }
                        else if(!turnp){
                            x2 = i;
                            y2 = j;
                            if(Tabuleiro.matriz[x][y].mover(x, x2, y, y2)){
                                turnp = true;
                                turnai = true;
                                fim = Tabuleiro.matriz[x][y].Batalha(x, x2, y, y2);
                            }
                        }
                    }
                    else if(evento.getSource() == debug){
                        //Tabuleiro.Debug();
                    }
                    else if(evento.getSource() == sair){
                            System.exit(0);
                        }
                    }
                }
            }

            AtualizaIcone();
            
            if(fim){
                vencedor = 1;
                turnai = false;
            }
            else if(Tabuleiro.FimdeJogo(2) == 1){
                fim =  true;
                vencedor = 1;
                turnai = false;
            }
            else{
                if(turnai){
                    fim = Tabuleiro.MovimentoAI();
                    turnai = false;
                }

                if(fim){
                    vencedor = 2;
                }
            }

            if(Tabuleiro.FimdeJogo(1) == 1){
                fim = true;
                vencedor = 2;
            }

            if(vencedor == 1){
                int n = JOptionPane.showOptionDialog(null,
                "Você venceu!!!","",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);
                
                Object opcoes[] = {"Sim", "Não"};
                int ans = JOptionPane.showOptionDialog(null,"Deseja jogar novamente?"
                        ,"Combate", JOptionPane.DEFAULT_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                                    
                    if(ans == 0){
                        dispose();
                    }
                    else{
                        System.exit(0);
                    }
                }
            
        else{
            for(i = 0; i < 5; i++){
                for(j = 0; j < 5; j++){
                    if(evento.getSource() == matrizbotao[i][j]){
                        x = i;
                        y = j;
                    }
                }   
            }
            
            System.out.println(x + "  " + y);
                                                                   
            if(Tabuleiro.matriz[x][y].time == 0){
                
              //  Tabuleiro.matriz[x][y] = Tabuleiro.time[Tabuleiro.quant];
                Tabuleiro.matriz[x][y].time = 1;
                Tabuleiro.matriz[x][y].setVisivel(true);
               // Tabuleiro.matriz[x][y].Imagens(1);
                //Tabuleiro.quant++;
            }
            
          //  if(Tabuleiro.quant == 10){
          //      pronto = true;
          //      vencedor = 0;
          //  }
            
            AtualizaIcone();
            }}
    
    

    
}
