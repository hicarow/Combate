package Peças;

import java.util.Random;

public final class Tabuleiro {
    
    static int i,j;
    public static Peças matriz[][] = new Peças[5][5];

    static Peças Jogador[]= new Peças[10], CPU[] = new Peças[10];
    
    

    
    
    public static void instanciaPeçasJogador(){
        
        Jogador[0] = new Soldado();
        Jogador[1] = new Soldado();
        Jogador[2] = new Soldado();
        Jogador[3] = new Marechal();
        Jogador[4] = new Bandeira();
        Jogador[5] = new Espião();
        Jogador[6] = new Cabo();
        Jogador[7] = new Cabo();
        Jogador[8] = new Bomba();
        Jogador[9] = new Bomba();
        
        for(int i=0;i<10;i++){
            Jogador[i].setVisivel(true);
        }
        for(int i=0;i<10;i++){
            Jogador[i].setCPU(false);
        }
        for(int i=0;i<10;i++){
            Jogador[i].setTime(1);
        }
   
    }
        public static void instanciaPeçasCPU(){
        
        CPU[0] = new Soldado();
        CPU[1] = new Soldado();
        CPU[2] = new Soldado();
        CPU[3] = new Marechal();
        CPU[4] = new Bandeira();
        CPU[5] = new Espião();
        CPU[6] = new Cabo();
        CPU[7] = new Cabo();
        CPU[8] = new Bomba();
        CPU[9] = new Bomba();
        
        for (int i = 0; i < 10; i++) {
            CPU[i].setVisivel(false);
        }
        for (int i = 0; i < 10; i++) {
            CPU[i].setCPU(true);
        }
        for (int i = 0; i < 10; i++) {
            CPU[i].setTime(2);
        }
        for (int i = 0; i < 10; i++) {
            CPU[i].setImagem(false, true);
        }

    }
    
    public static void posicionamentoCPU(){
        
        int i, l, c;

        Random Random = new Random();
        
        posicionaLago();
        
        for(i = 0; i < 10; i++){
                do{
                    l = Random.nextInt(2);
                    c = Random.nextInt(5);
                }while(matriz[l][c].getNivel() != 0);

                    matriz[l][c] = CPU[i];
                    matriz[l][c].setTime(2);
            }
    }
    
        public static void esvaziaTabuleiro(){
        int i, j;
                
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                matriz[i][j] = new Vazio();
            }
        }   
    }
    
    public void posicionamentoDefinido(){
        
        
        
        

    }
    public static void posicionamentoAleatorio(){
        int i, l, c;
        
        Random Random = new Random();
        
        for(i = 0; i < 10; i++){
            do{
                c = Random.nextInt(2) + 3;
                l = Random.nextInt(5);
            }
            while(matriz[l][c].getNivel() != 0);
            
                matriz[l][c] = Jogador[i];
                matriz[l][c].setTime(1);
        }
    }
    public static void posicionaLago(){
        
        Random aleatorio = new Random();
        i = aleatorio.nextInt(5);
                
        Tabuleiro.matriz[2][i] = new Lago();
        //return i;
    }
    public static void debug(){
        
        int i, j;
        
        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                if(matriz[i][j].getTime() == 2){
                    matriz[i][j].setVisivel(true);
                }
            }
        }
    }
}