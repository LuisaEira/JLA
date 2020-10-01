/*

    This class creates a counter to count the pieces that have been placed.
    After 6 pieces are placed in the board the game enters the second phase.

 */
package JLA;

public class Compteur {
    private int cont;
    public Compteur(int n){
        cont=n;
    }
    
    public int isComp(){
        return cont;
    }
    public void setComp(){
        cont++;
    }
    
    public void susComp(){
        cont--;
    }
    
    public void resetComp(){
        cont=0;
    }
    
}
