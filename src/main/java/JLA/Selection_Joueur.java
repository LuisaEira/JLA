/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba3;

/**
 *
 * @author lucaa
 */
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
}
