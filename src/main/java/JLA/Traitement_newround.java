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
    private JButton but[][] = new JButton[3][3];
    private Position bu;
    public Selection_Joueur joueur;
    private int nRan;
    private Compteur cont;
    private JLabel message; 
    private Band band;
    private JLabel JX;
    private JLabel JO;
    private Flag flag;

    public Traitement_newround(Flag fl, JLabel jx,JLabel jo,Compteur Comp,JLabel Mens,Selection_Joueur Joueur,JButton bout[][],Position bo, Band ba){
        but=bout;
        bu=bo;
        joueur=Joueur;
        message=Mens;
        cont=Comp;
        band=ba;
        JX = jx;
        JO = jo;
        flag = fl;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        but[0][0].setText("");
        but[0][1].setText("");
        but[0][2].setText("");
        but[1][0].setText("");
        but[1][1].setText("");
        but[1][2].setText("");
        but[2][0].setText("");
        but[2][1].setText("");
        but[2][2].setText("");
        bu.resPos();
        cont.resetComp();
        band.resetBand();
        band.resetBand2();
        Random miN = new Random();
        nRan = miN.nextInt(100);
        if (nRan<50){
            joueur.Joueur_1();
            message.setText(JX.getText() + ", c'est a Toi");
        }
        else if(nRan>=50){
            joueur.Joueur_2();
            message.setText(JO.getText() + ", c'est a Toi");
        }
        flag.Down();
    }
}
