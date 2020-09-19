/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author lucaa
 */
public class Traitement implements ActionListener {

    public Selection_Joueur joueur;
    private JButton bt;
    private Position b;
    private Compteur n_tour;
    private JLabel message;

    public Traitement(JLabel Mens, Selection_Joueur j, JButton bout, Position bo, Compteur n) {
        joueur = j;
        bt = bout;
        b = bo;
        n_tour = n;
        message = Mens;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        bt.setFont(new Font("Serif", Font.BOLD, 50));
//        bt.setText("X");
        System.out.println(joueur);
        if (n_tour.isComp() < 6) {
            if (joueur.quelJoueur() == 1) {
                bt.setFont(new Font("Serif", Font.BOLD, 45));
                bt.setText("X");
                b.Pos1();
                n_tour.setComp();
                joueur.Joueur_2();
            } else if (joueur.quelJoueur() == 2) {
                bt.setFont(new Font("Serif", Font.BOLD, 45));
                bt.setText("O");
                b.Pos2();
                n_tour.setComp();
                joueur.Joueur_1();
            }
        }
        else if(n_tour.isComp() > 6){
            
        }
    }
}
