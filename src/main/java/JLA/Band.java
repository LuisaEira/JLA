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
// Class laquelle ne permet pas de possitionner jettons ne les déplacer une fois qu'un des deux joueurs a gagné
public class Band {
    private int band;
//    private int band2;
    public Band(){
        band=0;
//        band2=0;
    }
    public int isBand(){
        return band;
    }
//    public int isBand2(){
//        return band2;
//    }
    public void setBand(){
        band=1;
    }
//    public void setBand2(){
//        band2=1;
//    }
    public void resetBand(){
        band=0;
    }
//    public void resetBand2(){
//        band2=0;
//    }
}
