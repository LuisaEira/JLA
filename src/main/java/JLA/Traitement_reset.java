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
    private JButton but11;
    private JButton but12;
    private JButton but13;
    private JButton but21;
    private JButton but22;
    private JButton but23;
    private JButton but31;
    private JButton but32;
    private JButton but33;
    private Position  bu;
    private int  NRan;
    public Selection_Joueur joueur;
    public Compteur cont;
    private JLabel message;
    private Result res;
    public Traitement_reset(Compteur Comp,JLabel Mens,Selection_Joueur Joueur,JLabel r_x,JLabel r_o,JButton bout11,JButton bout12,JButton bout13,JButton bout21,JButton bout22,JButton bout23,JButton bout31,JButton bout32,JButton bout33,Position bo,Result result){
        reset_x=r_x;
        reset_o=r_o;
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
        res=result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        reset_x.setText("0");
        reset_o.setText("0");
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
        res.resetRx();
        res.resetRo();
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
