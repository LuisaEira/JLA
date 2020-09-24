/*

    This class is used to start a new game. It resets the flag, the band, the
    positions and the results. It also creates pop-ups to enter the players
    names.

 */
package JLA;
//

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
    private JLabel jx;
    private JLabel jo;
    private Flag flag;
            
    public Traitement_reset(Flag fl, JLabel JX, JLabel JO, Compteur Comp,JLabel Mens,Selection_Joueur Joueur,JLabel r_x,JLabel r_o,JButton bout[][],Position bo,Result result,Band ba){
        reset_x=r_x;
        reset_o=r_o;
        but=bout;
        bu=bo;
        joueur=Joueur;
        message=Mens;
        cont=Comp;
        res=result;
        band=ba;
        jx = JX;
        jo = JO;
        flag = fl;
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
        String Joueur_x;
        Joueur_x = JOptionPane.showInputDialog("Saisir le prenom du joueur X:");
        jx.setText(Joueur_x);
        String Joueur_o;
        Joueur_o = JOptionPane.showInputDialog("Saisir le prenom du joueur O:");
        jo.setText(Joueur_o);
        if (NRan<50){
            joueur.Joueur_1();
//            System.out.println(J);
            message.setText(Joueur_x + ", c'est a Toi");
        }
        else if(NRan>=50){
            joueur.Joueur_2();
//            System.out.println(J);
            message.setText(Joueur_o + ", c'est a Toi");
        }
        flag.Down();
    }
}
