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
    private JButton bt11;
    private JButton bt12;
    private JButton bt13;
    private JButton bt21;
    private JButton bt22;
    private JButton bt23;
    private JButton bt31;
    private JButton bt32;
    private JButton bt33;
    private Compteur cont;
    private Band band;
    
    public Traitement_sel(Band ba,Position bo,JButton but11,JButton but12,JButton but13,JButton but21,JButton but22,JButton but23,JButton but31,JButton but32,JButton but33,Compteur n){
        b=bo;
        bt11=but11;
        bt12=but12;
        bt13=but13;
        bt21=but21;
        bt22=but22;
        bt23=but23;
        bt31=but31;
        bt32=but32;
        bt33=but33;
        cont=n;
        band=ba;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b.Pos0(b.quelLigne(), b.quelCol());
        if (b.quelLigne()==0&&b.quelCol()==0){
            bt11.setText("");
            cont.susComp();
            band.setBand2();
            
        }
        else if (b.quelLigne()==0&&b.quelCol()==1){
            bt12.setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==0&&b.quelCol()==2){
            bt13.setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==1&&b.quelCol()==0){
            bt21.setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==1&&b.quelCol()==1){
            bt22.setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==1&&b.quelCol()==2){
            bt23.setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==2&&b.quelCol()==0){
            bt31.setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==2&&b.quelCol()==1){
            bt32.setText("");
            cont.susComp();
            band.setBand2();
        }
        else if (b.quelLigne()==2&&b.quelCol()==2){
            bt33.setText("");
            cont.susComp();
            band.setBand2();
        }
    }
}
