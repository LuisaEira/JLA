/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

/**
 *
 * @author lucaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dim_x_fen=1050;
        int dim_y_fen=450;
        Selection_Joueur joueur = new Selection_Joueur(0);
        Compteur n_tour = new Compteur(0);
        int b11=0,b12=0,b13=0,b21=0,b22=0,b23=0,b31=0,b32=0,b33=0;
        String Joueur_x; //nom joueur 1 - jeton X
        Joueur_x = JOptionPane.showInputDialog("Saisir le prenom du joueur X:");
        String Joueur_o;//nom joueur 2 - jeton O
        Joueur_o = JOptionPane.showInputDialog("Saisir le prenom du joueur O:");
        JFrame Fen = new JFrame();
        Fen.setSize(dim_x_fen,dim_y_fen);
        Fen.setTitle("Jeu de L'Araign�e");
        Fen.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        JButton bt11 = new JButton("");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.weighty = 1.0;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt11,constraints);
//        constraints.weighty = 1.0;
//        constraints.weightx = 1.0;
        
        JButton bt12 = new JButton("");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt12,constraints);
        
        JButton bt13 = new JButton("");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt13,constraints);
        
        JButton bt21 = new JButton("");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt21,constraints);
        
        JButton bt22 = new JButton("");
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt22,constraints);
        
        JButton bt23 = new JButton("");
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt23,constraints);
        
        JButton bt31 = new JButton("");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt31,constraints);
        JButton bt32 = new JButton("");
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt32,constraints);
        
        JButton bt33 = new JButton("");
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(bt33,constraints);
        Fen.setVisible(true);
        constraints.weighty = 0.0;
        constraints.weightx = 0.0;
        
//        JLabel Jetton_x = new JLabel("X");
//////        URL url = this.getClass().getResource("C:\\Users\\lucaa\\OneDrive\\Escritorio\\Universidad\\2� Master (Erasmus)\\Java\\BE\\BE1_Not�");
////        ImageIcon icon = new ImageIcon("C:\\Users\\lucaa\\OneDrive\\Escritorio\\Universidad\\2� Master (Erasmus)\\Java\\BE\\BE1_Not�\\X_1.png");
////        Jetton_x.setIcon(icon);
//        Jetton_x.setFont(new Font("Serif", Font.BOLD, 20));
//        constraints.weightx = 0.5;
//        constraints.gridx = 3;
//        constraints.gridy = 3;
//        constraints.gridwidth = 1;
//        constraints.gridheight = 2;
//        constraints.fill = GridBagConstraints.CENTER;
//        Fen.getContentPane().add(Jetton_x,constraints);
//        
//        JLabel Jetton_o = new JLabel("O");
//        Jetton_o.setFont(new Font("Serif", Font.BOLD, 20));
//        constraints.weightx = 0.5;
//        constraints.gridx = 3;
//        constraints.gridy = 5;
//        constraints.gridwidth = 1;
//        constraints.gridheight = 2;
//        constraints.fill = GridBagConstraints.CENTER;
//        Fen.getContentPane().add(Jetton_o,constraints);
//        


        JLabel blanc2 = new JLabel("");
        constraints.weightx = 1.0;
        constraints.gridx = 3;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        Fen.getContentPane().add(blanc2,constraints);

        JLabel J1 = new JLabel("X       Joueur 1: ");
        J1.setFont(new Font("Serif", Font.PLAIN, 16));
        constraints.weightx = 0.5;
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        Fen.getContentPane().add(J1,constraints);
        
        JLabel J2 = new JLabel("O       Joueur 2: ");
        J2.setFont(new Font("Serif", Font.PLAIN, 16));
        constraints.weightx = 0.5;
        constraints.gridx = 4;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        Fen.getContentPane().add(J2,constraints);
        
        JLabel JX = new JLabel(Joueur_x);
        JX.setFont(new Font("Serif", Font.PLAIN, 16));
        constraints.weightx = 1.0;
        constraints.gridx = 5;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.WEST;
        Fen.getContentPane().add(JX,constraints);
        
        JLabel JO = new JLabel(Joueur_o);
        JO.setFont(new Font("Serif", Font.PLAIN, 16));
        constraints.weightx = 1.0;
        constraints.gridx = 5;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.WEST;
        Fen.getContentPane().add(JO,constraints);
        
        JLabel res = new JLabel("Resultat");
        res.setFont(new Font("Serif", Font.BOLD, 16));
        constraints.weightx = 1.0;
        constraints.gridx = 6;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        Fen.getContentPane().add(res,constraints);
        
        JLabel res_x = new JLabel("0");
        res_x.setFont(new Font("Serif", Font.PLAIN, 16));
        constraints.weightx = 1.0;
        constraints.gridx = 6;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        Fen.getContentPane().add(res_x,constraints);
        
        JLabel res_o = new JLabel("0");
        res_o.setFont(new Font("Serif", Font.PLAIN, 16));
        constraints.weightx = 1.0;
        constraints.gridx = 6;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        Fen.getContentPane().add(res_o,constraints);
        
        
        JButton NR = new JButton("New Round");
        constraints.weightx = 1.0;
        constraints.gridx = 5;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(NR,constraints);
        
        JButton NG = new JButton("Start New Game");
        constraints.weightx = 1.0;
        constraints.gridx = 4;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(NG,constraints);
        
        JLabel Mensaje = new JLabel("Press Start New Game");
        Mensaje.setFont(new Font("Serif", Font.PLAIN, 16));
        constraints.weightx = 1.0;
        constraints.gridx = 4;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        Fen.getContentPane().add(Mensaje,constraints);
        
        NG.addActionListener(new Traitement_reset(n_tour,Mensaje,joueur,res_x,res_o,bt11,bt12,bt13,bt21,bt22,bt23,bt31,bt32,bt33,b11,b12,b13,b21,b22,b23,b31,b32,b33));
        NR.addActionListener(new Traitement_newround(n_tour,Mensaje,joueur,bt11,bt12,bt13,bt21,bt22,bt23,bt31,bt32,bt33,b11,b12,b13,b21,b22,b23,b31,b32,b33));
        bt11.addActionListener(new Traitement(Mensaje,joueur,bt11,b11,n_tour));
        bt12.addActionListener(new Traitement(Mensaje,joueur,bt12,b12,n_tour));
        bt13.addActionListener(new Traitement(Mensaje,joueur,bt13,b13,n_tour));
        bt21.addActionListener(new Traitement(Mensaje,joueur,bt21,b21,n_tour));
        bt22.addActionListener(new Traitement(Mensaje,joueur,bt22,b22,n_tour));
        bt23.addActionListener(new Traitement(Mensaje,joueur,bt23,b23,n_tour));
        bt31.addActionListener(new Traitement(Mensaje,joueur,bt31,b31,n_tour));
        bt32.addActionListener(new Traitement(Mensaje,joueur,bt32,b32,n_tour));
        bt33.addActionListener(new Traitement(Mensaje,joueur,bt33,b33,n_tour));
//        URL url = this.getClass().getResource("direccion de la.imagen");
//
//        ImageIcon icon = new ImageIcon(url);
//
//        JLabel label = new JLabel();
//        label.setIcon(icon);
//
//        JButton boton = new JButton();
//        boton.setIcon(icon);
    }
    
}
