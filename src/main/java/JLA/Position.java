/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;
//
/**
 *
 * @author lucaa
 */
public class Position {
    private int b[][] = new int[3][3];
    public Position(){
        b[0][0]=0;
        b[0][1]=0;
        b[0][2]=0;
        b[1][0]=0;
        b[1][1]=0;
        b[1][2]=0;
        b[2][0]=0;
        b[2][1]=0;
        b[2][2]=0;
    }
    public int quelPos(int row,int col){
        return b[row][col];
    }
    public void Pos1(int row,int col){
        b[row][col]=1;
    }
    public void Pos2(int row,int col){
        b[row][col]=2;
    }
    public void resPos(){
        b[0][0]=0;
        b[0][1]=0;
        b[0][2]=0;
        b[1][0]=0;
        b[1][1]=0;
        b[1][2]=0;
        b[2][0]=0;
        b[2][1]=0;
        b[2][2]=0;
    }
}
