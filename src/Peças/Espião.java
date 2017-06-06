package Peças;

public class Espião extends Peças implements Mover {
    
    protected int nível;
    
    public Espião(){
        
        this.nome="Espião";
        this.nível = 1;
        this.móvel = true;
    }
    
    
    public void mover(){
        if(this.móvel==true){
            
            
        }
        /*else{
            return;
            
        }*/
    }
}
