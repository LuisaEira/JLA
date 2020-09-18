/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lucaa
 */
public class Paneau extends JPanel {
    public Paneau(){
        int dim=80;
        setLayout(new GridLayout(3,4));
//        JButton a_11 = new JButton("");
//        a_11.setSize(dim,dim);
       
        JButton a_11 = new JButton("");
        a_11.setBounds(dim,dim,dim,dim);
        add(a_11);
        JButton a_12 = new JButton("");
        a_12.setBounds(2*dim,dim,dim,dim);
        add(a_12);
        JButton a_13 = new JButton("");
        a_13.setBounds(3*dim,dim,dim,dim);
        add(a_13);
        
        JPanel p1 = new JPanel();
        add(p1);
        p1.setLayout(new GridLayout(2,1));
        
        JLabel j1 = new JLabel("Joueur 1 :");
        j1.setFont(new Font("Serif", Font.PLAIN, 20));
        p1.add(j1);
        
        JButton test = new JButton("");
        p1.add(test);
        
        JButton a_21 = new JButton("");
        a_21.setBounds(dim,2*dim,dim,dim);
        add(a_21);
        JButton a_22 = new JButton("");
        a_22.setBounds(2*dim,2*dim,dim,dim);
        add(a_22);
        JButton a_23 = new JButton("");
        a_23.setBounds(3*dim,2*dim,dim,dim);
        add(a_23);
        
        JPanel p2 = new JPanel();
        add(p2);
        
        JLabel j2 = new JLabel("Joueur 2 :");
        j2.setFont(new Font("Serif", Font.PLAIN, 20));
        p2.add(j2);
        
        JButton a_31 = new JButton("");
        a_31.setBounds(dim,3*dim,dim,dim);
        add(a_31);
        JButton a_32 = new JButton("");
        a_32.setBounds(2*dim,3*dim,dim,dim);
        add(a_32);
        JButton a_33 = new JButton("");
        a_33.setBounds(3*dim,3*dim,dim,dim);
        add(a_33);
        
        JPanel p3 = new JPanel();
        add(p3);
    }

    private void setBound(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
