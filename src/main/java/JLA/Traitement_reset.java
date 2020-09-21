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

public class Traitement_reset implements ActionListener {
    private JLabel reset_x;
    private JLabel reset_o;
    private JButton but[][] = new JButton[3][3];
    private Position  bu;
    private int  NRan;
    public Selection_Joueur joueur;
    public Compteur cont;
    private JLabel message;
    private Result res;
    private Band band;        
            
    public Traitement_reset(Compteur Comp,JLabel Mens,Selection_Joueur Joueur,JLabel r_x,JLabel r_o,JButton bout[][],Position bo,Result result,Band ba){
        reset_x=r_x;
        reset_o=r_o;
        but=bout;
        bu=bo;
        joueur=Joueur;
        message=Mens;
        cont=Comp;
        res=result;
        band=ba;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        reset_x.setText("0");
        reset_o.setText("0");
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
        res.resetRx();
        res.resetRo();
        band.resetBand();
        band.resetBand2();
        Random miN = new Random();
        NRan = miN.nextInt(100);
        if (NRan<50){
            joueur.Joueur_1();
//            System.out.println(J);
            message.setText("Joueur 1 c'est à Toi");
        }
        else if(NRan>=50){
            joueur.Joueur_2();
//            System.out.println(J);
            message.setText("Joueur 2 c'est à Toi");
        }
    }
}
