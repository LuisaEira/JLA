/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;

/**
 *
 * @author lucaa
 */
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
    
    public void resetComp(){
        cont=0;
    }
    
}
