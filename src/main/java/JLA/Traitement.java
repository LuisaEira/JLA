/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLA;
//

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author lucaa
 */
public class Traitement implements ActionListener {

    public Selection_Joueur joueur;
    private JButton bt;
    private Position b;
    private Compteur n_tour;
    private JLabel message;
    private JLabel res_o;
    private JLabel res_x;
    private Result res;
    private int f;
    private int c;
    private Band band;
    private JButton sel;

    public Traitement(JLabel Mens, Selection_Joueur j, JButton bout, Position bo, Compteur n, int row, int col, JLabel re_x, JLabel re_o, Result result, Band ba, JButton Sel) {
        joueur = j;
        bt = bout;
        b = bo;
        n_tour = n;
        message = Mens;
        f = row;
        c = col;
        res_x = re_x;
        res_o = re_o;
        res = result;
        band = ba;
        sel = Sel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        bt.setFont(new Font("Serif", Font.BOLD, 50));
//        bt.setText("X");
        //System.out.println(joueur);
        if (n_tour.isComp() < 6 && b.quelPos(f, c) != 1 && b.quelPos(f, c) != 2 && band.isBand() == 0) {
            System.out.println(band.isBand2());
            if (band.isBand2() == 0) {
                if (joueur.quelJoueur() == 1) {
                    bt.setFont(new Font("Serif", Font.BOLD, 45));
                    bt.setText("X");
                    b.Pos1(f, c);
                    if (b.quelPos(0, 0) == b.quelPos(0, 1) && b.quelPos(0, 0) == b.quelPos(0, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(1, 0) == b.quelPos(1, 1) && b.quelPos(1, 0) == b.quelPos(1, 2)) {
                        if (b.quelPos(1, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(1, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(2, 0) == b.quelPos(2, 1) && b.quelPos(2, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(2, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(2, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 0) && b.quelPos(0, 0) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 1) == b.quelPos(1, 1) && b.quelPos(0, 1) == b.quelPos(2, 1)) {
                        if (b.quelPos(0, 1) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 1) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 2) && b.quelPos(0, 2) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 1) && b.quelPos(0, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 1) && b.quelPos(0, 2) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    }
                    n_tour.setComp();
                    joueur.Joueur_2();
                    if (band.isBand() == 0) {
                        message.setText("Joueur 2 c'est à toi");
                    }

                } else if (joueur.quelJoueur() == 2) {
                    bt.setFont(new Font("Serif", Font.BOLD, 45));
                    bt.setText("O");
                    b.Pos2(f, c);
                    if (b.quelPos(0, 0) == b.quelPos(0, 1) && b.quelPos(0, 0) == b.quelPos(0, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(1, 0) == b.quelPos(1, 1) && b.quelPos(1, 0) == b.quelPos(1, 2)) {
                        if (b.quelPos(1, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(1, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(2, 0) == b.quelPos(2, 1) && b.quelPos(2, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(2, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(2, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 0) && b.quelPos(0, 0) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 1) == b.quelPos(1, 1) && b.quelPos(0, 1) == b.quelPos(2, 1)) {
                        if (b.quelPos(0, 1) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 1) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 2) && b.quelPos(0, 2) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 1) && b.quelPos(0, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 1) && b.quelPos(0, 2) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    }
                    n_tour.setComp();
                    joueur.Joueur_1();
                    if (band.isBand() == 0) {
                        message.setText("Joueur 1 c'est à toi");
                    }
                }
                System.out.println(band.isBand2() + "no entro");
            } else if (band.isBand2() == 1) {
                System.out.println(band.isBand2() + "entro");
                if (joueur.quelJoueur() == 1) {
                    if (b.quelLignedef() == 0 && b.quelColdef() == 0) {
                        if (((f == 0 && c == 1) || (f == 1 && c == 0) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 0 && b.quelColdef() == 2) {
                        if (((f == 0 && c == 1) || (f == 1 && c == 2) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 2 && b.quelColdef() == 0) {
                        if (((f == 1 && c == 0) || (f == 2 && c == 1) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 2 && b.quelColdef() == 2) {
                        if (((f == 2 && c == 1) || (f == 1 && c == 2) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 0 && b.quelColdef() == 1) {
                        if (((f == 0 && c == 0) || (f == 1 && c == 0) || (f == 1 && c == 1) || (f == 1 && c == 2) || (f == 0 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 1 && b.quelColdef() == 0) {
                        if (((f == 0 && c == 0) || (f == 0 && c == 1) || (f == 1 && c == 1) || (f == 2 && c == 1) || (f == 2 && c == 0)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 2 && b.quelColdef() == 1) {
                        if (((f == 2 && c == 0) || (f == 1 && c == 0) || (f == 1 && c == 1) || (f == 1 && c == 2) || (f == 2 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 1 && b.quelColdef() == 2) {
                        if (((f == 0 && c == 2) || (f == 0 && c == 1) || (f == 1 && c == 1) || (f == 2 && c == 1) || (f == 2 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    } else if (b.quelLignedef() == 1 && b.quelColdef() == 1) {
                        if (((f == 0 && c == 0) || (f == 0 && c == 1) || (f == 0 && c == 2) || (f == 1 && c == 0) || (f == 1 && c == 2) || (f == 2 && c == 0) || (f == 2 && c == 1) || (f == 2 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("X");
                            b.Pos1(f, c);
                        }
                    }
                    if (b.quelPos(0, 0) == b.quelPos(0, 1) && b.quelPos(0, 0) == b.quelPos(0, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(1, 0) == b.quelPos(1, 1) && b.quelPos(1, 0) == b.quelPos(1, 2)) {
                        if (b.quelPos(1, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(1, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(2, 0) == b.quelPos(2, 1) && b.quelPos(2, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(2, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(2, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 0) && b.quelPos(0, 0) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 1) == b.quelPos(1, 1) && b.quelPos(0, 1) == b.quelPos(2, 1)) {
                        if (b.quelPos(0, 1) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 1) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 2) && b.quelPos(0, 2) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 1) && b.quelPos(0, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 1) && b.quelPos(0, 2) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                        n_tour.setComp();
                        joueur.Joueur_2();
                    }
                } else if (joueur.quelJoueur() == 2) {
                    if (b.quelLignedef() == 0 && b.quelColdef() == 0) {
                        if (((f == 0 && c == 1) || (f == 1 && c == 0) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 0 && b.quelColdef() == 2) {
                        if (((f == 0 && c == 1) || (f == 1 && c == 2) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 2 && b.quelColdef() == 0) {
                        if (((f == 1 && c == 0) || (f == 2 && c == 1) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 2 && b.quelColdef() == 2) {
                        if (((f == 2 && c == 1) || (f == 1 && c == 2) || (f == 1 && c == 1)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 0 && b.quelColdef() == 1) {
                        if (((f == 0 && c == 0) || (f == 1 && c == 0) || (f == 1 && c == 1) || (f == 1 && c == 2) || (f == 0 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 1 && b.quelColdef() == 0) {
                        if (((f == 0 && c == 0) || (f == 0 && c == 1) || (f == 1 && c == 1) || (f == 2 && c == 1) || (f == 2 && c == 0)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 2 && b.quelColdef() == 1) {
                        if (((f == 2 && c == 0) || (f == 1 && c == 0) || (f == 1 && c == 1) || (f == 1 && c == 2) || (f == 2 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 1 && b.quelColdef() == 2) {
                        if (((f == 0 && c == 2) || (f == 0 && c == 1) || (f == 1 && c == 1) || (f == 2 && c == 1) || (f == 2 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    } else if (b.quelLignedef() == 1 && b.quelColdef() == 1) {
                        if (((f == 0 && c == 0) || (f == 0 && c == 1) || (f == 0 && c == 2) || (f == 1 && c == 0) || (f == 1 && c == 2) || (f == 2 && c == 0) || (f == 2 && c == 1) || (f == 2 && c == 2)) && b.quelPos(f, c) == 0) {
                            bt.setFont(new Font("Serif", Font.BOLD, 45));
                            bt.setText("O");
                            b.Pos2(f, c);
                        }
                    }
                    if (b.quelPos(0, 0) == b.quelPos(0, 1) && b.quelPos(0, 0) == b.quelPos(0, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(1, 0) == b.quelPos(1, 1) && b.quelPos(1, 0) == b.quelPos(1, 2)) {
                        if (b.quelPos(1, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(1, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(2, 0) == b.quelPos(2, 1) && b.quelPos(2, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(2, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(2, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 0) && b.quelPos(0, 0) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 1) == b.quelPos(1, 1) && b.quelPos(0, 1) == b.quelPos(2, 1)) {
                        if (b.quelPos(0, 1) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 1) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 2) && b.quelPos(0, 2) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 0) == b.quelPos(1, 1) && b.quelPos(0, 0) == b.quelPos(2, 2)) {
                        if (b.quelPos(0, 0) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 0) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    } else if (b.quelPos(0, 2) == b.quelPos(1, 1) && b.quelPos(0, 2) == b.quelPos(2, 0)) {
                        if (b.quelPos(0, 2) == 1) {
                            message.setText("Le Joueur 1 a gagné (Press Start New Game or New Round)");
                            res.setRx();
                            res_x.setText(res.isRx());
                            band.setBand();
                        } else if (b.quelPos(0, 2) == 2) {
                            message.setText("Le Joueur 2 a gagné (Press Start New Game or New Round)");
                            res.setRo();
                            res_o.setText(res.isRo());
                            band.setBand();
                        }
                    }
                    n_tour.setComp();
                    joueur.Joueur_1();
                }
            }
        } else if (n_tour.isComp() >= 6) {
            if (joueur.quelJoueur() == 1) {
                if (b.quelPos(f, c) == 1) {
                    b.setLigne(f);
                    b.setColonne(c);
                }
            } else if (joueur.quelJoueur() == 2) {
                if (b.quelPos(f, c) == 2) {
                    b.setLigne(f);
                    b.setColonne(c);

                }
            }
        }
    }
}
