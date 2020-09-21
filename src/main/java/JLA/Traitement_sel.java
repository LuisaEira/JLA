/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author lucaa
 */
public class Traitement_sel implements ActionListener {
    private Position b;
    private JButton bt[][] = new JButton[3][3];
    private Compteur cont;
    private Band band;
    
    public Traitement_sel(Band ba,Position bo,JButton but[][],Compteur n){
        b=bo;
        bt=but;
        cont=n;
        band=ba;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        b.Pos0(b.quelLigne(), b.quelCol());
        if (b.quelLigne()==0&&b.quelCol()==0){
            bt[0][0].setText("");
            cont.susComp();
            band.setBand2();
            
        }
        else if (b.quelLigne()==0&&b.quelCol()==1){
            bt[0][1].setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==0&&b.quelCol()==2){
            bt[0][2].setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==1&&b.quelCol()==0){
            bt[1][0].setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==1&&b.quelCol()==1){
            bt[1][1].setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==1&&b.quelCol()==2){
            bt[1][2].setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==2&&b.quelCol()==0){
            bt[2][0].setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==2&&b.quelCol()==1){
            bt[2][1].setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==2&&b.quelCol()==2){
            bt[2][2].setText("");
            cont.susComp();
            band.setBand2();
        }
    }
}
