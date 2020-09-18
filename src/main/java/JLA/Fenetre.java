/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;

import javax.swing.JFrame;

/**
 *
 * @author lucaa
 */
public class Fenetre extends JFrame {
    public Fenetre(){
        setTitle("Jeu de L'Araignée");
        setSize(1200,900);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Paneau());
    }
}
