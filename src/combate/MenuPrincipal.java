package combate;

import java.util.Scanner;
import java.util.Random;

public class MenuPrincipal {
    
    private int resp;
    
    public void posicionamento(){
        
        Peças Tabuleiro[][] = new Peças[5][5];
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                Tabuleiro[i][j] = new Peças("     ");
            }
        }
        Peças PeçasUser[] = new Peças[10];
        PeçasUser[0] = new Peças("espiã");
        PeçasUser[1] = new Peças("solda");
        PeçasUser[2] = new Peças("solda");
        PeçasUser[3] = new Peças("armei");
        PeçasUser[4] = new Peças("armei");
        PeçasUser[5] = new Peças("armei");
        PeçasUser[6] = new Peças("bomba");
        PeçasUser[7] = new Peças("bomba");
        PeçasUser[8] = new Peças("marec");
        PeçasUser[9] = new Peças("bande");
        
        Peças PeçasPc[] = new Peças[10];
        PeçasPc[0] = new Peças("espiã");
        PeçasPc[1] = new Peças("solda");
        PeçasPc[2] = new Peças("solda");
        PeçasPc[3] = new Peças("armei");
        PeçasPc[4] = new Peças("armei");
        PeçasPc[5] = new Peças("armei");
        PeçasPc[6] = new Peças("bomba");
        PeçasPc[7] = new Peças("bomba");
        PeçasPc[8] = new Peças("marec");
        PeçasPc[9] = new Peças("bande");
        
        System.out.println("Escolha o modo de jogo:\n1- Definido \n2- Aleatorio\n Tecle qualquer outra coisa para sair\\n\\n");
        Scanner entrada = new Scanner(System.in);
        resp = entrada.nextInt();
        
        switch (resp){
            
            case 1: 
                definido(PeçasUser, PeçasPc, Tabuleiro);
            break;
            
            case 2:
                aleatorio(PeçasUser, PeçasPc, Tabuleiro);
            break;
            
            default: System.out.println("Até a próxima!");
        }
    }
    
    private void definido(Peças PeçasUser[], Peças PeçasPc[], Peças Tabuleiro[][]){
        
        Peças lago = new Peças("lago ");
        Random radom = new Random();
        int n = 0, i = 0, j = 0;
        for(i = 0; i <2; i++){
            for(j = 0; j < 5; j++){
                n = radom.nextInt(10);
                Tabuleiro[i][j] = PeçasPc[n];
            }
        }
        
        j = radom.nextInt(5);
        Tabuleiro[2][j] = lago;
      
        for(i = 0; i< 5; i++){
            for (j = 0; j < 5; j++){
                System.out.printf("|" + Tabuleiro[i][j].nome);
            }
            System.out.println("\n");
        }
    }
    
    private void aleatorio(Peças PeçasUser[], Peças PeçasPc[], Peças Tabuleiro[][]){
        
        Peças lago = new Peças("lago ");
        Random radom = new Random();
        int n, i, j;
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                n = radom.nextInt(10);
                Tabuleiro[i][j] = PeçasPc[n];
            }
        }
        j = radom.nextInt(5);
        Tabuleiro[2][j] = lago;
        
        for(i = 3; i < 5; i++){
            for(j = 0; j < 5; j++){
                n = radom.nextInt(10);
                Tabuleiro[i][j] = PeçasUser[n];
            }
        }
        for(i = 0; i< 5; i++){
            for (j = 0; j < 5; j++){
                System.out.printf("|" + Tabuleiro[i][j].nome);
            }
            System.out.println("\n");
        }
    }
}