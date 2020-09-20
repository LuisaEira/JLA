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
    private int ligne;
    private int colonne;
    private int lignedef;
    private int colonnedef;
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
    public void Pos3(int row,int col){
        b[row][col]=3;
    }
    public void Pos0(int row,int col){
        b[row][col]=0;
    }
    public void setLigne(int lig){
        ligne=lig;
    }
    public void setColonne(int colo){
        colonne=colo;
    }
    public void setLignedef(int lig){
        lignedef=lig;
    }
    public void setColonnedef(int colo){
        colonnedef=colo;
    }
    public void resetColonne(){
        ligne=100;
        colonne=100;
    }
    public int quelLigne(){
        return ligne;
    }
    public int quelCol(){
        return colonne;
    }
    public int quelLignedef(){
        return lignedef;
    }
    public int quelColdef(){
        return colonnedef;
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
