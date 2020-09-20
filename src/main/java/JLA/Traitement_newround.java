/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;
//
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author lucaa
 */
public class Traitement_newround implements ActionListener {
    private JLabel reset_x;
    private JLabel reset_o;
    private JButton but11;
    private JButton but12;
    private JButton but13;
    private JButton but21;
    private JButton but22;
    private JButton but23;
    private JButton but31;
    private JButton but32;
    private JButton but33;
    private Position bu;
    public Selection_Joueur joueur;
    private int nRan;
    private Compteur cont;
    private JLabel message; 
    public Traitement_newround(Compteur Comp,JLabel Mens,Selection_Joueur Joueur,JButton bout11,JButton bout12,JButton bout13,JButton bout21,JButton bout22,JButton bout23,JButton bout31,JButton bout32,JButton bout33,Position bo){
        but11=bout11;
        but12=bout12;
        but13=bout13;
        but21=bout21;
        but22=bout22;
        but23=bout23;
        but31=bout31;
        but32=bout32;
        but33=bout33;
        bu=bo;
        joueur=Joueur;
        message=Mens;
        cont=Comp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        but11.setText("");
        but12.setText("");
        but13.setText("");
        but21.setText("");
        but22.setText("");
        but23.setText("");
        but31.setText("");
        but32.setText("");
        but33.setText("");
        bu.resPos();
        cont.resetComp();
        Random miN = new Random();
        nRan = miN.nextInt(100);
        if (nRan<50){
            joueur.Joueur_1();
            message.setText("Joueur 1 c'est à Toi");
        }
        else if(nRan>=50){
            joueur.Joueur_2();
            message.setText("Joueur 2 c'est à Toi");
        }
    }
}
