package combate;

import Peças.Espião;
import Peças.Soldado;
import Peças.Cabo_armeiro;
import Peças.Bomba;
import Peças.Bandeira;
import Peças.Lago;
import Peças.Marechal;
import java.util.Random;
import Peças.Peças;
import java.util.Scanner;

public class Tabuleiro {
    
    private int resp;
    static int i,j;
    Peças Tabuleiro[][] = new Peças[5][5];
    
    Peças PeçasUser[] = new Peças[10];
    Soldado soldado1 = new Soldado();
    Soldado soldado2 = new Soldado();
    Soldado soldado3 = new Soldado();
    Marechal marechal = new Marechal();
    Lago lago = new Lago();
    Espião espião = new Espião();
    Cabo_armeiro cabo_armeiro1 = new Cabo_armeiro();
    Cabo_armeiro cabo_armeiro2 = new Cabo_armeiro();
    Bomba bomba1 = new Bomba();
    Bomba bomba2 = new Bomba();
    Bandeira bandeira = new Bandeira();
    
    public void posicionamento(){
        
        System.out.println("Escolha o modo de jogo:\n1- Definido \n2- Aleatorio\n Tecle qualquer outra coisa para sair\\n\\n");
        Scanner entrada = new Scanner(System.in);
        resp = entrada.nextInt();
        
        switch (resp){
            
            case 1: 
                definido();
            break;
            
            case 2:
                aleatorio();
            break;
            
            default: System.out.println("Até a próxima!");
        }
    }
    
    private void definido(){
        
        Random radom = new Random();
        int n = 0, i = 0, j = 0;
        for(i = 0; i <2; i++){
            for(j = 0; j < 5; j++){
                n = radom.nextInt(10);
              //  Tabuleiro[i][j] = PeçasPc[n];
            }
        }
        
        j = radom.nextInt(5);
        Tabuleiro[2][j] = lago;
      
        for(i = 0; i< 5; i++){
            for (j = 0; j < 5; j++){
                System.out.printf("|" + Tabuleiro[i][j].getNome());
            }
            System.out.println("\n");
        }
    }
    
    private void aleatorio(){
        
        Random radom = new Random();
        int n, i, j;
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                n = radom.nextInt(10);
               // Tabuleiro[i][j] = PeçasPc[n];
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
                System.out.printf("|" + Tabuleiro[i][j].getNome());
            }
            System.out.println("\n");
        }
    }
    public void posicionaLago(){
        
        Random aleatorio = new Random();
        i = aleatorio.nextInt(6);
                
        Tabuleiro[i][3] = new Lago();
        
    }
    
    Tabuleiro(){
        
            for(i=0;i<5;i++){           
                for(j=0;j<5;j++){
                
                Tabuleiro[i][j] = new Marechal();
                
            }
        }
        
    }
    Tabuleiro(int i, int j, Peças Peça){
        
            for(i=0;i<5;i++){           
                for(j=0;j<5;j++){
                

                
                }
            }
    }
}