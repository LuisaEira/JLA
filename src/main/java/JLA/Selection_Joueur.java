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

//Class crée pour faire les changements de tour et pour que le jeu sache qui c'est a jouer
public class Selection_Joueur {
    private int Joueur;
    public Selection_Joueur(int J){
        Joueur=J;
    }
    
    public int quelJoueur(){
        return Joueur;
    }
    public void Joueur_1(){
        Joueur=1;
    }
    public void Joueur_2(){
        Joueur=2;
    }
    public void Changer(){
        if (Joueur == 1)
            Joueur = 2;
        else
            Joueur = 1;
    }
    public String Markeur(){
        if(Joueur == 1)
            return "X";
        else
            return "O";
    }
}
