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
public class Position {
    private int b;
    public Position(int pos){
        b=pos;
    }
    public int quelPos(){
        return b;
    }
    public void Pos1(){
        b=1;
    }
    public void Pos2(){
        b=2;
    }
    public void resPos(){
        b=0;
    }
}
