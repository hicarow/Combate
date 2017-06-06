package Peças;

public class Soldado extends Peças implements Mover {
    
    private int nível;
    public Soldado(){
        
        this.nome="Soldado";
        this.móvel=true;
        this.nível=2;
        
    }
    public void mover(){
        
    }
}
