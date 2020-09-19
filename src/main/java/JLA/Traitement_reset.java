/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;
//
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.Random;
        
/**
 *
 * @author lucaa
 */
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
    private Position  bu11;
    private Position  bu12;
    private Position  bu13;
    private Position  bu21;
    private Position  bu22;
    private Position  bu23;
    private Position  bu31;
    private Position  bu32;
    private Position  bu33;
    private int  NRan;
    public Selection_Joueur joueur;
    public Compteur cont;
    private JLabel message;
    public Traitement_reset(Compteur Comp,JLabel Mens,Selection_Joueur Joueur,JLabel r_x,JLabel r_o,JButton bout11,JButton bout12,JButton bout13,JButton bout21,JButton bout22,JButton bout23,JButton bout31,JButton bout32,JButton bout33,Position bo11,Position bo12,Position bo13,Position bo21,Position bo22,Position bo23,Position bo31,Position bo32,Position bo33){
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
        bu11=bo11;
        bu12=bo12;
        bu13=bo13;
        bu21=bo21;
        bu22=bo22;
        bu23=bo23;
        bu31=bo31;
        bu32=bo32;
        bu33=bo33;
        joueur=Joueur;
        message=Mens;
        cont=Comp;
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
        bu11.resPos();
        bu12.resPos();
        bu13.resPos();
        bu21.resPos();
        bu22.resPos();
        bu23.resPos();
        bu31.resPos();
        bu32.resPos();
        bu33.resPos();
        cont.resetComp();
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
